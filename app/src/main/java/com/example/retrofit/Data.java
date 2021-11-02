package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Data {



        private String id;

        @SerializedName("employee_name")
        private String employeeName;

        @SerializedName("employee_salary")
        private String employeeSalary;


        @SerializedName("employee_age")
        private String employeAge;


        @SerializedName("profile_image")
        private String profileImage;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeSalary() {
            return employeeSalary;
        }

        public void setEmployeeSalary(String employeeSalary) {
            this.employeeSalary = employeeSalary;
        }

        public String getEmployeAge() {
            return employeAge;
        }

        public void setEmployeAge(String employeAge) {
            this.employeAge = employeAge;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

}
