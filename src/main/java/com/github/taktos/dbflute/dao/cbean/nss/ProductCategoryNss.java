package com.github.taktos.dbflute.dao.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.github.taktos.dbflute.dao.cbean.cq.ProductCategoryCQ;

/**
 * The nest select set-upper of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCategoryCQ _query;
    public ProductCategoryNss(ProductCategoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public ProductCategoryNss withProductCategorySelf() {
        _query.doNss(new ProductCategoryCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductCategorySelf(); }});
		return new ProductCategoryNss(_query.queryProductCategorySelf());
    }

}
