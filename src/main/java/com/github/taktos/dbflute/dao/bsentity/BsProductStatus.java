package com.github.taktos.dbflute.dao.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.github.taktos.dbflute.dao.allcommon.DBMetaInstanceHandler;
import com.github.taktos.dbflute.dao.exentity.*;

/**
 * The entity of PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     PRODUCT
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     productList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductStatus implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected String _productStatusName;

    /** DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    protected Integer _displayOrder;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PRODUCT_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "productStatus";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getProductStatusCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PRODUCT as 'productList'. */
    protected List<Product> _productList;

    /**
     * PRODUCT as 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * PRODUCT as 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsProductStatus)) { return false; }
        BsProductStatus otherEntity = (BsProductStatus)other;
        if (!xSV(getProductStatusCode(), otherEntity.getProductStatusCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getProductStatusCode());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * Convert to display string of entity's data with relation data.
     * @return The display string of basic informations with one-nested relation values. (NotNull)
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_productList != null) { for (Entity e : _productList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "productList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * Build display string with custom options.
     * @param name The name for display. (NullAllowed: If it's null, it does not have a name)
     * @param column Does it contains column values or not?
     * @param relation Does it contains relation existences or not?
     * @return The display string for this entity. (NotNull)
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getProductStatusCode());
        sb.append(delimiter).append(getProductStatusName());
        sb.append(delimiter).append(getDisplayOrder());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_productList != null && !_productList.isEmpty())
        { sb.append(c).append("productList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public ProductStatus clone() {
        try {
            return (ProductStatus)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (NullAllowed)
     */
    public String getProductStatusName() {
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (NullAllowed)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.addPropertyName("productStatusName");
        this._productStatusName = productStatusName;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        this._displayOrder = displayOrder;
    }
}
