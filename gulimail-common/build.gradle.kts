project.description = "公共的依赖、bean、工具类等"

dependencies {
    api("com.baomidou:mybatis-plus-boot-starter:3.5.5") {
        exclude(group = "org.mybatis.spring.boot", module = "mybatis-spring")
    }
    api("org.apache.httpcomponents:httpcore:4.4.16")
    api("commons-lang:commons-lang:2.6")
    api("com.mysql:mysql-connector-j:8.2.0")
    api("org.mybatis:mybatis-spring:3.0.3")
}

tasks.bootJar {
    enabled = false
}
