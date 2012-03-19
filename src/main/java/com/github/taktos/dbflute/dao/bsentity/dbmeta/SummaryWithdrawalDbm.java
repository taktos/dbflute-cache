package com.github.taktos.dbflute.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.helper.StringKeyMap;
import com.github.taktos.dbflute.dao.allcommon.*;
import com.github.taktos.dbflute.dao.exentity.*;

/**
 * The DB meta of SUMMARY_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryWithdrawalDbm _instance = new SummaryWithdrawalDbm();
    private SummaryWithdrawalDbm() {}
    public static SummaryWithdrawalDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUMMARY_WITHDRAWAL";
    protected final String _tablePropertyName = "summaryWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, false, "memberId", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, false, "memberName", String.class, false, false, "VARCHAR", 200, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, false, "withdrawalReasonCode", String.class, false, false, "CHAR", 3, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, false, "withdrawalReasonText", String.class, false, false, "CLOB", 2147483647, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, false, "withdrawalReasonInputText", String.class, false, false, "CLOB", 2147483647, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, false, "withdrawalDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, false, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, false, "memberStatusName", String.class, false, false, "VARCHAR", 50, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxPurchasePrice = cci("MAX_PURCHASE_PRICE", "MAX_PURCHASE_PRICE", null, null, false, "maxPurchasePrice", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnMaxPurchasePrice() { return _columnMaxPurchasePrice; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnMaxPurchasePrice());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.github.taktos.dbflute.dao.exentity.SummaryWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.github.taktos.dbflute.dao.cbean.SummaryWithdrawalCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.SummaryWithdrawalDao"; }
    public String getBehaviorTypeName() { return "com.github.taktos.dbflute.dao.exbhv.SummaryWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryWithdrawal> getEntityType() { return SummaryWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SummaryWithdrawal newMyEntity() { return new SummaryWithdrawal(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SummaryWithdrawal)e, m, _epsMap); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SummaryWithdrawal)e, m, _epsMap); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected final Map<String, Eps<SummaryWithdrawal>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsMemberId(), columnMemberId());
        setupEps(_epsMap, new EpsMemberName(), columnMemberName());
        setupEps(_epsMap, new EpsWithdrawalReasonCode(), columnWithdrawalReasonCode());
        setupEps(_epsMap, new EpsWithdrawalReasonText(), columnWithdrawalReasonText());
        setupEps(_epsMap, new EpsWithdrawalReasonInputText(), columnWithdrawalReasonInputText());
        setupEps(_epsMap, new EpsWithdrawalDatetime(), columnWithdrawalDatetime());
        setupEps(_epsMap, new EpsMemberStatusCode(), columnMemberStatusCode());
        setupEps(_epsMap, new EpsMemberStatusName(), columnMemberStatusName());
        setupEps(_epsMap, new EpsMaxPurchasePrice(), columnMaxPurchasePrice());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((SummaryWithdrawal)entity, value); }

    public class EpsMemberId implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setMemberId(cti(v)); } }
    public static class EpsMemberName implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setMemberName((String)v); } }
    public static class EpsWithdrawalReasonCode implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setWithdrawalReasonCode((String)v); } }
    public static class EpsWithdrawalReasonText implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setWithdrawalReasonText((String)v); } }
    public static class EpsWithdrawalReasonInputText implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setWithdrawalReasonInputText((String)v); } }
    public static class EpsWithdrawalDatetime implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setWithdrawalDatetime((java.sql.Timestamp)v); } }
    public static class EpsMemberStatusCode implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setMemberStatusCode((String)v); } }
    public static class EpsMemberStatusName implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setMemberStatusName((String)v); } }
    public class EpsMaxPurchasePrice implements Eps<SummaryWithdrawal>
    { public void setup(SummaryWithdrawal e, Object v) { e.setMaxPurchasePrice(cti(v)); } }
}
