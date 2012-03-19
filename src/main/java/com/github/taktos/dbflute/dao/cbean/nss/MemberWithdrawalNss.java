package com.github.taktos.dbflute.dao.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.github.taktos.dbflute.dao.cbean.cq.MemberWithdrawalCQ;

/**
 * The nest select set-upper of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberWithdrawalCQ _query;
    public MemberWithdrawalNss(MemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public MemberNss withMember() {
        _query.doNss(new MemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
		return new MemberNss(_query.queryMember());
    }
    public WithdrawalReasonNss withWithdrawalReason() {
        _query.doNss(new MemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryWithdrawalReason(); }});
		return new WithdrawalReasonNss(_query.queryWithdrawalReason());
    }

}
