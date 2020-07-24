package com.example.fac;

class UserHelperClass {
    private String name, phone, gender, dob, age;

    public UserHelperClass(String name, String phone, String gender, String dob, String age) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
