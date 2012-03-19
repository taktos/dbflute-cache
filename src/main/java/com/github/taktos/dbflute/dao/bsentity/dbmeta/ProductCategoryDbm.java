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
 * The DB meta of PRODUCT_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductCategoryDbm _instance = new ProductCategoryDbm();
    private ProductCategoryDbm() {}
    public static ProductCategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT_CATEGORY";
    protected final String _tablePropertyName = "productCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCategoryCode = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, null, true, "productCategoryCode", String.class, true, false, "CHAR", 3, 0, false, null, null, null, "productList,productCategorySelfList", null);
    protected final ColumnInfo _columnProductCategoryName = cci("PRODUCT_CATEGORY_NAME", "PRODUCT_CATEGORY_NAME", null, null, true, "productCategoryName", String.class, false, false, "VARCHAR", 50, 0, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentCategoryCode = cci("PARENT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", null, null, false, "parentCategoryCode", String.class, false, false, "CHAR", 3, 0, false, null, null, "productCategorySelf", null, null);

    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    public ColumnInfo columnProductCategoryName() { return _columnProductCategoryName; }
    public ColumnInfo columnParentCategoryCode() { return _columnParentCategoryCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnProductCategoryCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignProductCategorySelf() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnParentCategoryCode(), ProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("productCategorySelf", this, ProductCategoryDbm.getInstance(), map, 0, false, false, false, "productCategorySelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductCategoryCode(), ProductDbm.getInstance().columnProductCategoryCode());
        return cri("productList", this, ProductDbm.getInstance(), map, false, "productCategory");
    }
    public ReferrerInfo referrerProductCategorySelfList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.getInstance().columnParentCategoryCode());
        return cri("productCategorySelfList", this, ProductCategoryDbm.getInstance(), map, false, "productCategorySelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.github.taktos.dbflute.dao.exentity.ProductCategory"; }
    public String getConditionBeanTypeName() { return "com.github.taktos.dbflute.dao.cbean.ProductCategoryCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.ProductCategoryDao"; }
    public String getBehaviorTypeName() { return "com.github.taktos.dbflute.dao.exbhv.ProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductCategory> getEntityType() { return ProductCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public ProductCategory newMyEntity() { return new ProductCategory(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((ProductCategory)e, m, _epsMap); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((ProductCategory)e, m, _epsMap); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected final Map<String, Eps<ProductCategory>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsProductCategoryCode(), columnProductCategoryCode());
        setupEps(_epsMap, new EpsProductCategoryName(), columnProductCategoryName());
        setupEps(_epsMap, new EpsParentCategoryCode(), columnParentCategoryCode());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((ProductCategory)entity, value); }

    public static class EpsProductCategoryCode implements Eps<ProductCategory>
    { public void setup(ProductCategory e, Object v) { e.setProductCategoryCode((String)v); } }
    public static class EpsProductCategoryName implements Eps<ProductCategory>
    { public void setup(ProductCategory e, Object v) { e.setProductCategoryName((String)v); } }
    public static class EpsParentCategoryCode implements Eps<ProductCategory>
    { public void setup(ProductCategory e, Object v) { e.setParentCategoryCode((String)v); } }
}
