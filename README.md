# sm: Staff Management System
This is a simple staff management system based on Spring and MyBatis.

## Project structure

```
表现层：
  global  工具类
  controller  控制器
  *.jsp  页面
```

```
业务层：
  service  接口
  service - impl  实现类
```

```
持久层：
  entity  实体类  
  dao  接口  
  resources  映射文件  
```

## Directory Structure

```
sm
├── 1.\ login.png
├── 2.\ staff\ management.png
├── 3.\ personal\ center.png
├── 4.\ log\ management.png
├── README.md
├── pom.xml
├── sm_service
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── sm
│           │       ├── dao
│           │       │   ├── DepartmentDao.java
│           │       │   ├── LogDao.java
│           │       │   ├── SelfDao.java
│           │       │   └── StaffDao.java
│           │       ├── entity
│           │       │   ├── Department.java
│           │       │   ├── Log.java
│           │       │   └── Staff.java
│           │       └── service
│           │           ├── DepartmentService.java
│           │           ├── LogService.java
│           │           ├── SelfService.java
│           │           ├── StaffService.java
│           │           └── impl
│           │               ├── DepartmentServiceImpl.java
│           │               ├── LogServiceImpl.java
│           │               ├── SelfServiceImpl.java
│           │               └── StaffServiceImpl.java
│           └── resources
│               ├── sm
│               │   └── dao
│               │       ├── DepartmentDao.xml
│               │       ├── LogDao.xml
│               │       ├── SelfDao.xml
│               │       └── StaffDao.xml
│               └── spring.xml
└── sm_web
    ├── pom.xml
    └── src
        └── main
            ├── java
            │   └── sm
            │       ├── controller
            │       │   ├── DepartmentController.java
            │       │   ├── LogController.java
            │       │   ├── SelfController.java
            │       │   └── StaffController.java
            │       └── global
            │           ├── DispatcherServlet.java
            │           ├── EncodingFilter.java
            │           ├── LogAdvice.java
            │           └── LoginFilter.java
            └── webapp
                ├── WEB-INF
                │   └── web.xml
                ├── css ── *
                ├── images ── *
                ├── js ── *
                └── *.jsp
```

## Project Display

![login](https://github.com/chao2015/sm/blob/master/1.%20login.png?raw=true)


![staffmanagement](https://github.com/chao2015/sm/blob/master/2.%20staff%20management.png?raw=true)


![personalcenter](https://github.com/chao2015/sm/blob/master/3.%20personal%20center.png?raw=true)


![logmanagement](https://github.com/chao2015/sm/blob/master/4.%20log%20management.png?raw=true)

