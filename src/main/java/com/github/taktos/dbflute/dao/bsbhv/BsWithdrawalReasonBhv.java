package com.github.taktos.dbflute.dao.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.github.taktos.dbflute.dao.exbhv.*;
import com.github.taktos.dbflute.dao.exentity.*;
import com.github.taktos.dbflute.dao.bsentity.dbmeta.*;
import com.github.taktos.dbflute.dao.cbean.*;

/**
 * The behavior of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 * 
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWithdrawalReasonBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WITHDRAWAL_REASON"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WithdrawalReasonDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WithdrawalReasonDbm getMyDBMeta() { return WithdrawalReasonDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WithdrawalReason newMyEntity() { return new WithdrawalReason(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WithdrawalReasonCB newMyConditionBean() { return new WithdrawalReasonCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * int count = withdrawalReasonBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The selected count.
     */
    public int selectCount(WithdrawalReasonCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WithdrawalReasonCB cb) { // called by selectCount(cb) 
        assertCBNotNull(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WithdrawalReasonCB cb) { // called by selectPage(cb)
        assertCBNotNull(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WithdrawalReason&gt;() {
     *     public void handle(WithdrawalReason entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param entityRowHandler The handler of entity row of WithdrawalReason. (NotNull)
     */
    public void selectCursor(WithdrawalReasonCB cb, EntityRowHandler<WithdrawalReason> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> void doSelectCursor(WithdrawalReasonCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<WithdrawalReason>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * WithdrawalReason withdrawalReason = withdrawalReasonBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (withdrawalReason != null) {
     *     ... = withdrawalReason.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntity(WithdrawalReasonCB cb) {
        return doSelectEntity(cb, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> ENTITY doSelectEntity(final WithdrawalReasonCB cb, final Class<ENTITY> entityType) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, WithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(WithdrawalReasonCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * WithdrawalReason withdrawalReason = withdrawalReasonBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = withdrawalReason.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntityWithDeletedCheck(WithdrawalReasonCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> ENTITY doSelectEntityWithDeletedCheck(final WithdrawalReasonCB cb, final Class<ENTITY> entityType) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(WithdrawalReasonCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectByPKValue(String withdrawalReasonCode) {
        return doSelectByPKValue(withdrawalReasonCode, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> ENTITY doSelectByPKValue(String withdrawalReasonCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(withdrawalReasonCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param withdrawalReasonCode The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectByPKValueWithDeletedCheck(String withdrawalReasonCode) {
        return doSelectByPKValueWithDeletedCheck(withdrawalReasonCode, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> ENTITY doSelectByPKValueWithDeletedCheck(String withdrawalReasonCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(withdrawalReasonCode), entityType);
    }

    private WithdrawalReasonCB buildPKCB(String withdrawalReasonCode) {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        WithdrawalReasonCB cb = newMyConditionBean();
        cb.query().setWithdrawalReasonCode_Equal(withdrawalReasonCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WithdrawalReason&gt; withdrawalReasonList = withdrawalReasonBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WithdrawalReason withdrawalReason : withdrawalReasonList) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WithdrawalReason> selectList(WithdrawalReasonCB cb) {
        return doSelectList(cb, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> ListResultBean<ENTITY> doSelectList(WithdrawalReasonCB cb, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(WithdrawalReasonCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WithdrawalReason&gt; page = withdrawalReasonBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WithdrawalReason withdrawalReason : page) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WithdrawalReason> selectPage(WithdrawalReasonCB cb) {
        return doSelectPage(cb, WithdrawalReason.class);
    }

    protected <ENTITY extends WithdrawalReason> PagingResultBean<ENTITY> doSelectPage(WithdrawalReasonCB cb, Class<ENTITY> entityType) {
        assertCBNotNull(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WithdrawalReasonCB>() {
            public int callbackSelectCount(WithdrawalReasonCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WithdrawalReasonCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * withdrawalReasonBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WithdrawalReasonCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WithdrawalReasonCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBNotNull(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberWithdrawalList(WithdrawalReason withdrawalReason, ConditionBeanSetupper<MemberWithdrawalCB> conditionBeanSetupper) {
        xassLRArg(withdrawalReason, conditionBeanSetupper);
        loadMemberWithdrawalList(xnewLRLs(withdrawalReason), conditionBeanSetupper);
    }
    /**
     * Load referrer of memberWithdrawalList with the set-upper for condition-bean of referrer. <br />
     * MEMBER_WITHDRAWAL as 'memberWithdrawalList'.
     * <pre>
     * withdrawalReasonBhv.<span style="color: #FD4747">loadMemberWithdrawalList</span>(withdrawalReasonList, new ConditionBeanSetupper&lt;MemberWithdrawalCB&gt;() {
     *     public void setup(MemberWithdrawalCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WithdrawalReason withdrawalReason : withdrawalReasonList) {
     *     ... = withdrawalReason.<span style="color: #FD4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberWithdrawalList(List<WithdrawalReason> withdrawalReasonList, ConditionBeanSetupper<MemberWithdrawalCB> conditionBeanSetupper) {
        xassLRArg(withdrawalReasonList, conditionBeanSetupper);
        loadMemberWithdrawalList(withdrawalReasonList, new LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberWithdrawalList(WithdrawalReason withdrawalReason, LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReason, loadReferrerOption);
        loadMemberWithdrawalList(xnewLRLs(withdrawalReason), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberWithdrawalList(List<WithdrawalReason> withdrawalReasonList, LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReasonList, loadReferrerOption);
        if (withdrawalReasonList.isEmpty()) { return; }
        final MemberWithdrawalBhv referrerBhv = xgetBSFLR().select(MemberWithdrawalBhv.class);
        helpLoadReferrerInternally(withdrawalReasonList, loadReferrerOption, new InternalLoadReferrerCallback<WithdrawalReason, String, MemberWithdrawalCB, MemberWithdrawal>() {
            public String getPKVal(WithdrawalReason e)
            { return e.getWithdrawalReasonCode(); }
            public void setRfLs(WithdrawalReason e, List<MemberWithdrawal> ls)
            { e.setMemberWithdrawalList(ls); }
            public MemberWithdrawalCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MemberWithdrawalCB cb, List<String> ls)
            { cb.query().setWithdrawalReasonCode_InScope(ls); }
            public void qyOdFKAsc(MemberWithdrawalCB cb) { cb.query().addOrderBy_WithdrawalReasonCode_Asc(); }
            public void spFKCol(MemberWithdrawalCB cb) { cb.specify().columnWithdrawalReasonCode(); }
            public List<MemberWithdrawal> selRfLs(MemberWithdrawalCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(MemberWithdrawal e) { return e.getWithdrawalReasonCode(); }
            public void setlcEt(MemberWithdrawal re, WithdrawalReason le)
            { re.setWithdrawalReason(le); }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * withdrawalReasonBhv.<span style="color: #FD4747">insert</span>(withdrawalReason);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param withdrawalReason The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(WithdrawalReason withdrawalReason) {
        doInsert(withdrawalReason, null);
    }

    protected void doInsert(WithdrawalReason withdrawalReason, InsertOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareInsertOption(option);
        delegateInsert(withdrawalReason, option);
    }

    protected void prepareInsertOption(InsertOption<WithdrawalReasonCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * withdrawalReason.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #FD4747">update</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param withdrawalReason The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final WithdrawalReason withdrawalReason) {
        doUpdate(withdrawalReason, null);
    }

    protected void doUpdate(WithdrawalReason withdrawalReason, final UpdateOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareUpdateOption(option);
        helpUpdateInternally(withdrawalReason, new InternalUpdateCallback<WithdrawalReason>() {
            public int callbackDelegateUpdate(WithdrawalReason entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WithdrawalReasonCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WithdrawalReasonCB createCBForVaryingUpdate() {
        WithdrawalReasonCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WithdrawalReasonCB createCBForSpecifiedUpdate() {
        WithdrawalReasonCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param withdrawalReason The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(WithdrawalReason withdrawalReason) {
        doInesrtOrUpdate(withdrawalReason, null, null);
    }

    protected void doInesrtOrUpdate(WithdrawalReason withdrawalReason, final InsertOption<WithdrawalReasonCB> insertOption, final UpdateOption<WithdrawalReasonCB> updateOption) {
        helpInsertOrUpdateInternally(withdrawalReason, new InternalInsertOrUpdateCallback<WithdrawalReason, WithdrawalReasonCB>() {
            public void callbackInsert(WithdrawalReason entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WithdrawalReason entity) { doUpdate(entity, updateOption); }
            public WithdrawalReasonCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WithdrawalReasonCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WithdrawalReasonCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WithdrawalReasonCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * withdrawalReason.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #FD4747">delete</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param withdrawalReason The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WithdrawalReason withdrawalReason) {
        doDelete(withdrawalReason, null);
    }

    protected void doDelete(WithdrawalReason withdrawalReason, final DeleteOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareDeleteOption(option);
        helpDeleteInternally(withdrawalReason, new InternalDeleteCallback<WithdrawalReason>() {
            public int callbackDelegateDelete(WithdrawalReason entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WithdrawalReasonCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are insert target. (so default constraints are not available) <br />
     * And if the table has an identity, entities after the process do not have incremented values.
     * (When you use the (normal) insert(), an entity after the process has an incremented value)
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchInsert(withdrawalReasonList, null);
    }

    protected int[] doBatchInsert(List<WithdrawalReason> withdrawalReasonList, InsertOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareInsertOption(option);
        return delegateBatchInsert(withdrawalReasonList, option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchUpdate(withdrawalReasonList, null);
    }

    protected int[] doBatchUpdate(List<WithdrawalReason> withdrawalReasonList, UpdateOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(withdrawalReasonList, option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<WithdrawalReason> withdrawalReasonList, SpecifyQuery<WithdrawalReasonCB> updateColumnSpec) {
        return doBatchUpdate(withdrawalReasonList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchDelete(withdrawalReasonList, null);
    }

    protected int[] doBatchDelete(List<WithdrawalReason> withdrawalReasonList, DeleteOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareDeleteOption(option);
        return delegateBatchDelete(withdrawalReasonList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * withdrawalReasonBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WithdrawalReason, WithdrawalReasonCB&gt;() {
     *     public ConditionBean setup(withdrawalReason entity, WithdrawalReasonCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> setupper, InsertOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WithdrawalReason entity = new WithdrawalReason();
        WithdrawalReasonCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WithdrawalReasonCB createCBForQueryInsert() {
        WithdrawalReasonCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. {NonExclusiveControl}
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #FD4747">queryUpdate</span>(withdrawalReason, cb);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WithdrawalReason withdrawalReason, WithdrawalReasonCB cb) {
        return doQueryUpdate(withdrawalReason, cb, null);
    }

    protected int doQueryUpdate(WithdrawalReason withdrawalReason, WithdrawalReasonCB cb, UpdateOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("withdrawalReason", withdrawalReason); assertCBNotNull(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(withdrawalReason, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WithdrawalReasonCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WithdrawalReasonCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #FD4747">queryDelete</span>(withdrawalReason, cb);
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WithdrawalReasonCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WithdrawalReasonCB cb, DeleteOption<WithdrawalReasonCB> option) {
        assertCBNotNull(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WithdrawalReasonCB)cb); }
        else { return varyingQueryDelete((WithdrawalReasonCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * InsertOption<WithdrawalReasonCB> option = new InsertOption<WithdrawalReasonCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * withdrawalReasonBhv.<span style="color: #FD4747">varyingInsert</span>(withdrawalReason, option);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param withdrawalReason The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(WithdrawalReason withdrawalReason, InsertOption<WithdrawalReasonCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(withdrawalReason, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * withdrawalReason.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WithdrawalReasonCB&gt; option = new UpdateOption&lt;WithdrawalReasonCB&gt;();
     *     option.self(new SpecifyQuery&lt;WithdrawalReasonCB&gt;() {
     *         public void specify(WithdrawalReasonCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     withdrawalReasonBhv.<span style="color: #FD4747">varyingUpdate</span>(withdrawalReason, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(WithdrawalReason withdrawalReason, UpdateOption<WithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(withdrawalReason, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param withdrawalReason The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(WithdrawalReason withdrawalReason, InsertOption<WithdrawalReasonCB> insertOption, UpdateOption<WithdrawalReasonCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(withdrawalReason, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param withdrawalReason The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WithdrawalReason withdrawalReason, DeleteOption<WithdrawalReasonCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(withdrawalReason, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<WithdrawalReason> withdrawalReasonList, InsertOption<WithdrawalReasonCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(withdrawalReasonList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<WithdrawalReason> withdrawalReasonList, UpdateOption<WithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(withdrawalReasonList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<WithdrawalReason> withdrawalReasonList, DeleteOption<WithdrawalReasonCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(withdrawalReasonList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> setupper, InsertOption<WithdrawalReasonCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WithdrawalReasonCB&gt; option = new UpdateOption&lt;WithdrawalReasonCB&gt;();
     * option.self(new SpecifyQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void specify(WithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * withdrawalReasonBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(withdrawalReason, cb, option);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WithdrawalReason withdrawalReason, WithdrawalReasonCB cb, UpdateOption<WithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(withdrawalReason, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WithdrawalReasonCB cb, DeleteOption<WithdrawalReasonCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<WithdrawalReasonBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WithdrawalReasonCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WithdrawalReasonCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WithdrawalReason> void delegateSelectCursor(WithdrawalReasonCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WithdrawalReason> List<ENTITY> delegateSelectList(WithdrawalReasonCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WithdrawalReason e, InsertOption<WithdrawalReasonCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WithdrawalReason e, UpdateOption<WithdrawalReasonCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WithdrawalReason e, UpdateOption<WithdrawalReasonCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WithdrawalReason e, DeleteOption<WithdrawalReasonCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WithdrawalReason e, DeleteOption<WithdrawalReasonCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WithdrawalReason> ls, InsertOption<WithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WithdrawalReason> ls, UpdateOption<WithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WithdrawalReason> ls, UpdateOption<WithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WithdrawalReason> ls, DeleteOption<WithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WithdrawalReason> ls, DeleteOption<WithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WithdrawalReason e, WithdrawalReasonCB inCB, ConditionBean resCB, InsertOption<WithdrawalReasonCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WithdrawalReason e, WithdrawalReasonCB cb, UpdateOption<WithdrawalReasonCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WithdrawalReasonCB cb, DeleteOption<WithdrawalReasonCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WithdrawalReason downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WithdrawalReason.class);
    }

    protected WithdrawalReasonCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WithdrawalReasonCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WithdrawalReason> downcast(List<? extends Entity> entityList) {
        return (List<WithdrawalReason>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WithdrawalReasonCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WithdrawalReasonCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WithdrawalReasonCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WithdrawalReasonCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WithdrawalReasonCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WithdrawalReasonCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB>)option;
    }
}
