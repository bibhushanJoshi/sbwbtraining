package com.lftechnology.sbworkbench.training.manageorganization.service.persistence;

import com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException;
import com.lftechnology.sbworkbench.training.manageorganization.model.department;
import com.lftechnology.sbworkbench.training.manageorganization.model.impl.departmentImpl;
import com.lftechnology.sbworkbench.training.manageorganization.model.impl.departmentModelImpl;
import com.lftechnology.sbworkbench.training.manageorganization.service.persistence.departmentPersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see departmentPersistence
 * @see departmentUtil
 * @generated
 */
public class departmentPersistenceImpl extends BasePersistenceImpl<department>
    implements departmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link departmentUtil} to access the department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = departmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DN = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DN",
            new String[] { Long.class.getName(), String.class.getName() },
            departmentModelImpl.GROUPID_COLUMN_BITMASK |
            departmentModelImpl.DEPARTMENTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_DN = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            departmentModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            departmentModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DEPARTMENT = "SELECT department FROM department department";
    private static final String _SQL_SELECT_DEPARTMENT_WHERE = "SELECT department FROM department department WHERE ";
    private static final String _SQL_COUNT_DEPARTMENT = "SELECT COUNT(department) FROM department department";
    private static final String _SQL_COUNT_DEPARTMENT_WHERE = "SELECT COUNT(department) FROM department department WHERE ";
    private static final String _FINDER_COLUMN_G_DN_GROUPID_2 = "department.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_DN_DEPARTMENTNAME_1 = "department.departmentName IS NULL";
    private static final String _FINDER_COLUMN_G_DN_DEPARTMENTNAME_2 = "department.departmentName = ?";
    private static final String _FINDER_COLUMN_G_DN_DEPARTMENTNAME_3 = "(department.departmentName IS NULL OR department.departmentName = ?)";
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "department.groupId = ?";
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "department.companyId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "department.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No department exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No department exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(departmentPersistenceImpl.class);
    private static department _nulldepartment = new departmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<department> toCacheModel() {
                return _nulldepartmentCacheModel;
            }
        };

    private static CacheModel<department> _nulldepartmentCacheModel = new CacheModel<department>() {
            public department toEntityModel() {
                return _nulldepartment;
            }
        };

    @BeanReference(type = departmentPersistence.class)
    protected departmentPersistence departmentPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the department in the entity cache if it is enabled.
     *
     * @param department the department
     */
    public void cacheResult(department department) {
        EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey(), department);

        department.resetOriginalValues();
    }

    /**
     * Caches the departments in the entity cache if it is enabled.
     *
     * @param departments the departments
     */
    public void cacheResult(List<department> departments) {
        for (department department : departments) {
            if (EntityCacheUtil.getResult(
                        departmentModelImpl.ENTITY_CACHE_ENABLED,
                        departmentImpl.class, department.getPrimaryKey()) == null) {
                cacheResult(department);
            } else {
                department.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all departments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(departmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(departmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the department.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(department department) {
        EntityCacheUtil.removeResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<department> departments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (department department : departments) {
            EntityCacheUtil.removeResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                departmentImpl.class, department.getPrimaryKey());
        }
    }

    /**
     * Creates a new department with the primary key. Does not add the department to the database.
     *
     * @param departmentId the primary key for the new department
     * @return the new department
     */
    public department create(long departmentId) {
        department department = new departmentImpl();

        department.setNew(true);
        department.setPrimaryKey(departmentId);

        return department;
    }

    /**
     * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param departmentId the primary key of the department
     * @return the department that was removed
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department remove(long departmentId)
        throws NoSuchdepartmentException, SystemException {
        return remove(Long.valueOf(departmentId));
    }

    /**
     * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the department
     * @return the department that was removed
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department remove(Serializable primaryKey)
        throws NoSuchdepartmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            department department = (department) session.get(departmentImpl.class,
                    primaryKey);

            if (department == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchdepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(department);
        } catch (NoSuchdepartmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected department removeImpl(department department)
        throws SystemException {
        department = toUnwrappedModel(department);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, department);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(department);

        return department;
    }

    @Override
    public department updateImpl(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department,
        boolean merge) throws SystemException {
        department = toUnwrappedModel(department);

        boolean isNew = department.isNew();

        departmentModelImpl departmentModelImpl = (departmentModelImpl) department;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, department, merge);

            department.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !departmentModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((departmentModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(departmentModelImpl.getOriginalGroupId()),
                        
                        departmentModelImpl.getOriginalDepartmentName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN,
                    args);

                args = new Object[] {
                        Long.valueOf(departmentModelImpl.getGroupId()),
                        
                        departmentModelImpl.getDepartmentName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN,
                    args);
            }

            if ((departmentModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(departmentModelImpl.getOriginalGroupId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] {
                        Long.valueOf(departmentModelImpl.getGroupId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((departmentModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(departmentModelImpl.getOriginalCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] {
                        Long.valueOf(departmentModelImpl.getCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey(), department);

        return department;
    }

    protected department toUnwrappedModel(department department) {
        if (department instanceof departmentImpl) {
            return department;
        }

        departmentImpl departmentImpl = new departmentImpl();

        departmentImpl.setNew(department.isNew());
        departmentImpl.setPrimaryKey(department.getPrimaryKey());

        departmentImpl.setDepartmentId(department.getDepartmentId());
        departmentImpl.setDepartmentName(department.getDepartmentName());
        departmentImpl.setCreatedBy(department.getCreatedBy());
        departmentImpl.setCreatedOn(department.getCreatedOn());
        departmentImpl.setCompanyId(department.getCompanyId());
        departmentImpl.setGroupId(department.getGroupId());

        return departmentImpl;
    }

    /**
     * Returns the department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the department
     * @return the department
     * @throws com.liferay.portal.NoSuchModelException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the department with the primary key or throws a {@link com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException} if it could not be found.
     *
     * @param departmentId the primary key of the department
     * @return the department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByPrimaryKey(long departmentId)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByPrimaryKey(departmentId);

        if (department == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + departmentId);
            }

            throw new NoSuchdepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                departmentId);
        }

        return department;
    }

    /**
     * Returns the department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the department
     * @return the department, or <code>null</code> if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param departmentId the primary key of the department
     * @return the department, or <code>null</code> if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByPrimaryKey(long departmentId)
        throws SystemException {
        department department = (department) EntityCacheUtil.getResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                departmentImpl.class, departmentId);

        if (department == _nulldepartment) {
            return null;
        }

        if (department == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                department = (department) session.get(departmentImpl.class,
                        Long.valueOf(departmentId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (department != null) {
                    cacheResult(department);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                        departmentImpl.class, departmentId, _nulldepartment);
                }

                closeSession(session);
            }
        }

        return department;
    }

    /**
     * Returns all the departments where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @return the matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByG_DN(long groupId, String departmentName)
        throws SystemException {
        return findByG_DN(groupId, departmentName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the departments where groupId = &#63; and departmentName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @return the range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByG_DN(long groupId, String departmentName,
        int start, int end) throws SystemException {
        return findByG_DN(groupId, departmentName, start, end, null);
    }

    /**
     * Returns an ordered range of all the departments where groupId = &#63; and departmentName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByG_DN(long groupId, String departmentName,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN;
            finderArgs = new Object[] { groupId, departmentName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DN;
            finderArgs = new Object[] {
                    groupId, departmentName,
                    
                    start, end, orderByComparator
                };
        }

        List<department> list = (List<department>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (department department : list) {
                if ((groupId != department.getGroupId()) ||
                        !Validator.equals(departmentName,
                            department.getDepartmentName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

            if (departmentName == null) {
                query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_1);
            } else {
                if (departmentName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(departmentModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (departmentName != null) {
                    qPos.add(departmentName);
                }

                list = (List<department>) QueryUtil.list(q, getDialect(),
                        start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first department in the ordered set where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByG_DN_First(long groupId, String departmentName,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByG_DN_First(groupId, departmentName,
                orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", departmentName=");
        msg.append(departmentName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the first department in the ordered set where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByG_DN_First(long groupId, String departmentName,
        OrderByComparator orderByComparator) throws SystemException {
        List<department> list = findByG_DN(groupId, departmentName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last department in the ordered set where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByG_DN_Last(long groupId, String departmentName,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByG_DN_Last(groupId, departmentName,
                orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", departmentName=");
        msg.append(departmentName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the last department in the ordered set where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByG_DN_Last(long groupId, String departmentName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_DN(groupId, departmentName);

        List<department> list = findByG_DN(groupId, departmentName, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the departments before and after the current department in the ordered set where groupId = &#63; and departmentName = &#63;.
     *
     * @param departmentId the primary key of the current department
     * @param groupId the group ID
     * @param departmentName the department name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department[] findByG_DN_PrevAndNext(long departmentId, long groupId,
        String departmentName, OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = findByPrimaryKey(departmentId);

        Session session = null;

        try {
            session = openSession();

            department[] array = new departmentImpl[3];

            array[0] = getByG_DN_PrevAndNext(session, department, groupId,
                    departmentName, orderByComparator, true);

            array[1] = department;

            array[2] = getByG_DN_PrevAndNext(session, department, groupId,
                    departmentName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected department getByG_DN_PrevAndNext(Session session,
        department department, long groupId, String departmentName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEPARTMENT_WHERE);

        query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

        if (departmentName == null) {
            query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_1);
        } else {
            if (departmentName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_3);
            } else {
                query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_2);
            }
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(departmentModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (departmentName != null) {
            qPos.add(departmentName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(department);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<department> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the departments where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the departments where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @return the range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the departments where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<department> list = (List<department>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (department department : list) {
                if ((groupId != department.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(departmentModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                list = (List<department>) QueryUtil.list(q, getDialect(),
                        start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first department in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByGroupId_First(groupId, orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the first department in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<department> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last department in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByGroupId_Last(groupId, orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the last department in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        List<department> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the departments before and after the current department in the ordered set where groupId = &#63;.
     *
     * @param departmentId the primary key of the current department
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department[] findByGroupId_PrevAndNext(long departmentId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = findByPrimaryKey(departmentId);

        Session session = null;

        try {
            session = openSession();

            department[] array = new departmentImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, department, groupId,
                    orderByComparator, true);

            array[1] = department;

            array[2] = getByGroupId_PrevAndNext(session, department, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected department getByGroupId_PrevAndNext(Session session,
        department department, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEPARTMENT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(departmentModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(department);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<department> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the departments where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the departments where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @return the range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the departments where companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param companyId the company ID
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findByCompanyId(long companyId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<department> list = (List<department>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (department department : list) {
                if ((companyId != department.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(departmentModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<department>) QueryUtil.list(q, getDialect(),
                        start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first department in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByCompanyId_First(companyId,
                orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the first department in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<department> list = findByCompanyId(companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last department in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByCompanyId_Last(companyId,
                orderByComparator);

        if (department != null) {
            return department;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchdepartmentException(msg.toString());
    }

    /**
     * Returns the last department in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching department, or <code>null</code> if a matching department could not be found
     * @throws SystemException if a system exception occurred
     */
    public department fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        List<department> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the departments before and after the current department in the ordered set where companyId = &#63;.
     *
     * @param departmentId the primary key of the current department
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next department
     * @throws com.lftechnology.sbworkbench.training.manageorganization.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public department[] findByCompanyId_PrevAndNext(long departmentId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchdepartmentException, SystemException {
        department department = findByPrimaryKey(departmentId);

        Session session = null;

        try {
            session = openSession();

            department[] array = new departmentImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, department,
                    companyId, orderByComparator, true);

            array[1] = department;

            array[2] = getByCompanyId_PrevAndNext(session, department,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected department getByCompanyId_PrevAndNext(Session session,
        department department, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEPARTMENT_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(departmentModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(department);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<department> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the departments.
     *
     * @return the departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @return the range of departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of departments
     * @throws SystemException if a system exception occurred
     */
    public List<department> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<department> list = (List<department>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEPARTMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEPARTMENT.concat(departmentModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<department>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<department>) QueryUtil.list(q, getDialect(),
                            start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the departments where groupId = &#63; and departmentName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_DN(long groupId, String departmentName)
        throws SystemException {
        for (department department : findByG_DN(groupId, departmentName)) {
            remove(department);
        }
    }

    /**
     * Removes all the departments where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByGroupId(long groupId) throws SystemException {
        for (department department : findByGroupId(groupId)) {
            remove(department);
        }
    }

    /**
     * Removes all the departments where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyId(long companyId) throws SystemException {
        for (department department : findByCompanyId(companyId)) {
            remove(department);
        }
    }

    /**
     * Removes all the departments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (department department : findAll()) {
            remove(department);
        }
    }

    /**
     * Returns the number of departments where groupId = &#63; and departmentName = &#63;.
     *
     * @param groupId the group ID
     * @param departmentName the department name
     * @return the number of matching departments
     * @throws SystemException if a system exception occurred
     */
    public int countByG_DN(long groupId, String departmentName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, departmentName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_DN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

            if (departmentName == null) {
                query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_1);
            } else {
                if (departmentName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_DN_DEPARTMENTNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (departmentName != null) {
                    qPos.add(departmentName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_DN,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of departments where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching departments
     * @throws SystemException if a system exception occurred
     */
    public int countByGroupId(long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of departments where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching departments
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyId(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEPARTMENT_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of departments.
     *
     * @return the number of departments
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_DEPARTMENT);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the department persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lftechnology.sbworkbench.training.manageorganization.model.department")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<department>> listenersList = new ArrayList<ModelListener<department>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<department>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(departmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
