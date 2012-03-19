package com.github.taktos.dbflute.dao.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.github.taktos.dbflute.dao.cbean.*;
import com.github.taktos.dbflute.dao.cbean.cq.bs.*;
import com.github.taktos.dbflute.dao.cbean.cq.*;

/**
 * The condition-query for in-line of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueVendorCheckId() { return _myCQ.getVendorCheckId(); }
    protected ConditionValue getCValueTypeOfChar() { return _myCQ.getTypeOfChar(); }
    protected ConditionValue getCValueTypeOfVarchar() { return _myCQ.getTypeOfVarchar(); }
    protected ConditionValue getCValueTypeOfClob() { return _myCQ.getTypeOfClob(); }
    protected ConditionValue getCValueTypeOfText() { return _myCQ.getTypeOfText(); }
    protected ConditionValue getCValueTypeOfNumericInteger() { return _myCQ.getTypeOfNumericInteger(); }
    protected ConditionValue getCValueTypeOfNumericBigint() { return _myCQ.getTypeOfNumericBigint(); }
    protected ConditionValue getCValueTypeOfNumericDecimal() { return _myCQ.getTypeOfNumericDecimal(); }
    protected ConditionValue getCValueTypeOfNumericIntegerMin() { return _myCQ.getTypeOfNumericIntegerMin(); }
    protected ConditionValue getCValueTypeOfNumericIntegerMax() { return _myCQ.getTypeOfNumericIntegerMax(); }
    protected ConditionValue getCValueTypeOfNumericBigintMin() { return _myCQ.getTypeOfNumericBigintMin(); }
    protected ConditionValue getCValueTypeOfNumericBigintMax() { return _myCQ.getTypeOfNumericBigintMax(); }
    protected ConditionValue getCValueTypeOfNumericSuperintMin() { return _myCQ.getTypeOfNumericSuperintMin(); }
    protected ConditionValue getCValueTypeOfNumericSuperintMax() { return _myCQ.getTypeOfNumericSuperintMax(); }
    protected ConditionValue getCValueTypeOfNumericMaxdecimal() { return _myCQ.getTypeOfNumericMaxdecimal(); }
    protected ConditionValue getCValueTypeOfInteger() { return _myCQ.getTypeOfInteger(); }
    protected ConditionValue getCValueTypeOfBigint() { return _myCQ.getTypeOfBigint(); }
    protected ConditionValue getCValueTypeOfDate() { return _myCQ.getTypeOfDate(); }
    protected ConditionValue getCValueTypeOfTimestamp() { return _myCQ.getTypeOfTimestamp(); }
    protected ConditionValue getCValueTypeOfTime() { return _myCQ.getTypeOfTime(); }
    protected ConditionValue getCValueTypeOfBoolean() { return _myCQ.getTypeOfBoolean(); }
    protected ConditionValue getCValueTypeOfBinary() { return _myCQ.getTypeOfBinary(); }
    protected ConditionValue getCValueTypeOfBlob() { return _myCQ.getTypeOfBlob(); }
    protected ConditionValue getCValueTypeOfUuid() { return _myCQ.getTypeOfUuid(); }
    protected ConditionValue getCValueTypeOfArray() { return _myCQ.getTypeOfArray(); }
    protected ConditionValue getCValueTypeOfOther() { return _myCQ.getTypeOfOther(); }
    protected ConditionValue getCValueUYText() { return _myCQ.getUYText(); }
    public String keepScalarCondition(VendorCheckCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepMyselfInScope(VendorCheckCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
