package com.lftechnology.sbworkbench.training.manageorganization.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.sbworkbench.training.manageorganization.service.http.departmentServiceSoap}.
 *
 * @author    Sanjib Maharjan
 * @see       com.lftechnology.sbworkbench.training.manageorganization.service.http.departmentServiceSoap
 * @generated
 */
public class departmentSoap implements Serializable {
    private long _departmentId;
    private String _departmentName;
    private String _createdBy;
    private String _createdOn;
    private long _companyId;
    private long _groupId;

    public departmentSoap() {
    }

    public static departmentSoap toSoapModel(department model) {
        departmentSoap soapModel = new departmentSoap();

        soapModel.setDepartmentId(model.getDepartmentId());
        soapModel.setDepartmentName(model.getDepartmentName());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedOn(model.getCreatedOn());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static departmentSoap[] toSoapModels(department[] models) {
        departmentSoap[] soapModels = new departmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static departmentSoap[][] toSoapModels(department[][] models) {
        departmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new departmentSoap[models.length][models[0].length];
        } else {
            soapModels = new departmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static departmentSoap[] toSoapModels(List<department> models) {
        List<departmentSoap> soapModels = new ArrayList<departmentSoap>(models.size());

        for (department model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new departmentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _departmentId;
    }

    public void setPrimaryKey(long pk) {
        setDepartmentId(pk);
    }

    public long getDepartmentId() {
        return _departmentId;
    }

    public void setDepartmentId(long departmentId) {
        _departmentId = departmentId;
    }

    public String getDepartmentName() {
        return _departmentName;
    }

    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;
    }

    public String getCreatedBy() {
        return _createdBy;
    }

    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;
    }

    public String getCreatedOn() {
        return _createdOn;
    }

    public void setCreatedOn(String createdOn) {
        _createdOn = createdOn;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
