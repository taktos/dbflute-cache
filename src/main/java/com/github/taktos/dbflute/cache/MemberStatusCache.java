package com.github.taktos.dbflute.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.framework.container.SingletonS2Container;

import com.github.taktos.dbflute.dao.cbean.MemberStatusCB;
import com.github.taktos.dbflute.dao.exbhv.MemberStatusBhv;
import com.github.taktos.dbflute.dao.exentity.MemberStatus;

/**
 * MEMBER_STATSUテーブルのキャッシュ実装サンプル。
 * @author taktos
 *
 */
public final class MemberStatusCache {
	private static MemberStatusCache instance;
	static {
		initialize();
	}

	private final Map<String, MemberStatus> cache;

	private MemberStatusCache(Map<String, MemberStatus> map) {
		this.cache = map;
	}

	private MemberStatus getCached(String memberStatusCode) {
		return cache.get(memberStatusCode);
	}

	/**
	 * キャッシュを初期化する。
	 */
	public static final void initialize() {
		MemberStatusBhv bhv = SingletonS2Container.getComponent(MemberStatusBhv.class);
		List<MemberStatus> list = bhv.selectList(new MemberStatusCB());
		Map<String,MemberStatus> map = new HashMap<String, MemberStatus>();
		for (MemberStatus memberStatus : list) {
			map.put(memberStatus.getMemberStatusCode(), memberStatus);
		}
		instance = new MemberStatusCache(map);
	}

	/**
	 * BsEntityのFK先インスタンス取得時に呼ばれるメソッド。
	 * @param memberStatusCode
	 * @return キャッシュされたエンティティ。無ければ null。
	 */
	public static MemberStatus get(String memberStatusCode) {
		return instance.getCached(memberStatusCode);
	}
}
