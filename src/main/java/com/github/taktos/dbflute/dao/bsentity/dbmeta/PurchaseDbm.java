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
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseDbm _instance = new PurchaseDbm();
    private PurchaseDbm() {}
    public static PurchaseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, true, "purchaseId", Long.class, true, true, "BIGINT", 19, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, "member", null, null);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, true, "productId", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, "product", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, true, "purchaseDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, true, "purchaseCount", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, true, "purchasePrice", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, true, "paymentCompleteFlg", Integer.class, false, false, "INTEGER", 10, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR", 200, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR", 200, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Long.class, false, false, "BIGINT", 19, 0, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnProductId() { return _columnProductId; }
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("member", this, MemberDbm.getInstance(), map, 0, false, false, false, "purchaseList");
    }
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("product", this, ProductDbm.getInstance(), map, 1, false, false, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.github.taktos.dbflute.dao.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "com.github.taktos.dbflute.dao.cbean.PurchaseCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.PurchaseDao"; }
    public String getBehaviorTypeName() { return "com.github.taktos.dbflute.dao.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Purchase> getEntityType() { return Purchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Purchase newMyEntity() { return new Purchase(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Purchase)e, m, _epsMap); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Purchase)e, m, _epsMap); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected final Map<String, Eps<Purchase>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPurchaseId(), columnPurchaseId());
        setupEps(_epsMap, new EpsMemberId(), columnMemberId());
        setupEps(_epsMap, new EpsProductId(), columnProductId());
        setupEps(_epsMap, new EpsPurchaseDatetime(), columnPurchaseDatetime());
        setupEps(_epsMap, new EpsPurchaseCount(), columnPurchaseCount());
        setupEps(_epsMap, new EpsPurchasePrice(), columnPurchasePrice());
        setupEps(_epsMap, new EpsPaymentCompleteFlg(), columnPaymentCompleteFlg());
        setupEps(_epsMap, new EpsRegisterDatetime(), columnRegisterDatetime());
        setupEps(_epsMap, new EpsRegisterUser(), columnRegisterUser());
        setupEps(_epsMap, new EpsUpdateDatetime(), columnUpdateDatetime());
        setupEps(_epsMap, new EpsUpdateUser(), columnUpdateUser());
        setupEps(_epsMap, new EpsVersionNo(), columnVersionNo());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((Purchase)entity, value); }

    public class EpsPurchaseId implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setPurchaseId(ctl(v)); } }
    public class EpsMemberId implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setMemberId(cti(v)); } }
    public class EpsProductId implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setProductId(cti(v)); } }
    public static class EpsPurchaseDatetime implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setPurchaseDatetime((java.sql.Timestamp)v); } }
    public class EpsPurchaseCount implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setPurchaseCount(cti(v)); } }
    public class EpsPurchasePrice implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setPurchasePrice(cti(v)); } }
    public class EpsPaymentCompleteFlg implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setPaymentCompleteFlg(cti(v)); } }
    public static class EpsRegisterDatetime implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setRegisterDatetime((java.sql.Timestamp)v); } }
    public static class EpsRegisterUser implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setRegisterUser((String)v); } }
    public static class EpsUpdateDatetime implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setUpdateDatetime((java.sql.Timestamp)v); } }
    public static class EpsUpdateUser implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setUpdateUser((String)v); } }
    public class EpsVersionNo implements Eps<Purchase>
    { public void setup(Purchase e, Object v) { e.setVersionNo(ctl(v)); } }
}
