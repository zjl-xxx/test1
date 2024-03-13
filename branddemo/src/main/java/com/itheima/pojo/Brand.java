package com.itheima.pojo;

public class Brand {

    private Integer id;
    private String brand_name;
    private String company_name;
    private Integer ordered;
    private String description;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getordered() {
        return ordered;
    }

    public void setordered(Integer orderd) {
        this.ordered = orderd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "brand{" +
                "id=" + id +
                ", brandName='" + brand_name + '\'' +
                ", companyName='" + company_name + '\'' +
                ", orderd=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }


}

