package com.github.taktos.dbflute.cache;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import com.github.taktos.dbflute.dao.cbean.MemberCB;
import com.github.taktos.dbflute.dao.exbhv.MemberBhv;
import com.github.taktos.dbflute.dao.exentity.Member;
import com.github.taktos.dbflute.dao.exentity.MemberLogin;
import com.github.taktos.dbflute.dao.exentity.MemberStatus;

public class MemberStatusCacheTest {

	@BeforeClass
	public static void initContainer() {
		SingletonS2ContainerFactory.setConfigPath("dbflute.dicon");
		SingletonS2ContainerFactory.init();
	}

	/**
	 * キャッシュ自体のテスト。
	 */
	@Test
	public void testGet() {
		MemberStatus cached = MemberStatusCache.get("FML");

		assertNotNull("キャッシュからインスタンスが取れる", cached);
		assertEquals("キーが一致している", "FML", cached.getMemberStatusCode());
		assertEquals("キー以外の項目にも値がある", "正式会員", cached.getMemberStatusName());
	}

	/**
	 * DBアクセスせずに生成したEntityからも、キャッシュにアクセスできることを確認するテスト。
	 */
	@Test
	public void testCache() {
		// given
		Member member = new Member();
		member.setMemberStatusCode("FML");

		// when
		MemberStatus memberStatus = member.getMemberStatus();

		// then
		assertNotNull("キャッシュからインスタンスが取れる", memberStatus);

		// given
		MemberLogin login = new MemberLogin();
		login.setLoginMemberStatusCode("FML");

		// when
		MemberStatus loginMemberStatus = login.getMemberStatus();

		// then
		assertTrue("毎回同じインスタンスが返ってくる", memberStatus == loginMemberStatus);
	}

	/**
	 * 明示的に取得していない関連テーブルのインスタンスがキャッシュから取れることを確認するテスト。
	 * @throws Exception
	 */
	@Test
	public void testSetupSelect() throws Exception {
		// given
		MemberBhv bhv = SingletonS2Container.getComponent(MemberBhv.class);
		Member member = bhv.selectByPKValueWithDeletedCheck(1);

		// when
		MemberStatus memberStatus = member.getMemberStatus();

		// then
		assertNotNull("setupSelectしていなくても、キャッシュからインスタンスが取れる", memberStatus);

		// given
		MemberCB cb = new MemberCB();
		cb.setupSelect_MemberStatus();
		cb.query().setMemberId_Equal(1);
		Member setupMember = bhv.selectEntityWithDeletedCheck(cb);

		// when
		MemberStatus setupStatus = setupMember.getMemberStatus();

		// then
		assertTrue("setupSelectするとDBから取得する", memberStatus != setupStatus);
	}
}
