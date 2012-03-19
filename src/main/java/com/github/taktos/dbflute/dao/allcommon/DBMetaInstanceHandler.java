package com.github.taktos.dbflute.dao.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.lang.reflect.Method;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.DBMetaNotFoundException;
import org.seasar.dbflute.helper.StringKeyMap;
import org.seasar.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** Table DB-name instance map. */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of table DB name and class name. This is for initialization. */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("MEMBER", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberDbm");
        tmpMap.put("MEMBER_ADDRESS", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberAddressDbm");
        tmpMap.put("MEMBER_LOGIN", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberLoginDbm");
        tmpMap.put("MEMBER_SECURITY", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberSecurityDbm");
        tmpMap.put("MEMBER_SERVICE", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberServiceDbm");
        tmpMap.put("MEMBER_STATUS", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberStatusDbm");
        tmpMap.put("MEMBER_WITHDRAWAL", "com.github.taktos.dbflute.dao.bsentity.dbmeta.MemberWithdrawalDbm");
        tmpMap.put("PRODUCT", "com.github.taktos.dbflute.dao.bsentity.dbmeta.ProductDbm");
        tmpMap.put("PRODUCT_CATEGORY", "com.github.taktos.dbflute.dao.bsentity.dbmeta.ProductCategoryDbm");
        tmpMap.put("PRODUCT_STATUS", "com.github.taktos.dbflute.dao.bsentity.dbmeta.ProductStatusDbm");
        tmpMap.put("PURCHASE", "com.github.taktos.dbflute.dao.bsentity.dbmeta.PurchaseDbm");
        tmpMap.put("REGION", "com.github.taktos.dbflute.dao.bsentity.dbmeta.RegionDbm");
        tmpMap.put("SERVICE_RANK", "com.github.taktos.dbflute.dao.bsentity.dbmeta.ServiceRankDbm");
        tmpMap.put("VENDOR_$_DOLLAR", "com.github.taktos.dbflute.dao.bsentity.dbmeta.Vendor$DollarDbm");
        tmpMap.put("VENDOR_CHECK", "com.github.taktos.dbflute.dao.bsentity.dbmeta.VendorCheckDbm");
        tmpMap.put("WITHDRAWAL_REASON", "com.github.taktos.dbflute.dao.bsentity.dbmeta.WithdrawalReasonDbm");
        tmpMap.put("SUMMARY_PRODUCT", "com.github.taktos.dbflute.dao.bsentity.dbmeta.SummaryProductDbm");
        tmpMap.put("SUMMARY_WITHDRAWAL", "com.github.taktos.dbflute.dao.bsentity.dbmeta.SummaryWithdrawalDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name. This is for conversion at finding. */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
        for (String tableDbName : tableDbNameSet) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta.
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull & NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
            for (String tableDbName : tableDbNameSet) {
                findDBMeta(tableDbName); // Initialize!
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap:";
                msg = msg + " tableDbNameInstanceMap=" + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: " + tableFlexibleName;
            msg = msg + " key=" + tableFlexibleName + " instanceMap=" + _tableDbNameInstanceMap;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       By Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        tableFlexibleName = removeSchemaIfExists(tableFlexibleName);
        tableFlexibleName = removeQuoteIfExists(tableFlexibleName);
        final String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName != null) {
            return byTableDbName(tableDbName);
        }
        return null;
    }

    protected static String removeSchemaIfExists(String name) {
        final int dotLastIndex = name.lastIndexOf(".");
        if (dotLastIndex >= 0) {
            name = name.substring(dotLastIndex + ".".length());
        }
        return name; 
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            name = name.substring(1);
            name = name.substring(0, name.length() - 1);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            name = name.substring(1);
            name = name.substring(0, name.length() - 1);
        }
        return name;
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String entityName = _tableDbNameClassNameMap.get(tableDbName);
            _tableDbNameInstanceMap.put(tableDbName, getDBMeta(entityName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta getDBMeta(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Method methoz = clazz.getMethod("getInstance", (Class[])null);
            Object result = methoz.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
