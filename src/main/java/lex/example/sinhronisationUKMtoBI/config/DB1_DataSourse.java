package lex.example.sinhronisationUKMtoBI.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"lex.example.sinhronisationUKMtoBI.repository.bi"},
        entityManagerFactoryRef = "db1DSEmFactory",
        transactionManagerRef = "db1DSTransactionManager")
public class DB1_DataSourse {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties db1DSProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource db1DS(@Qualifier("db1DSProperties") DataSourceProperties userDSProperties) {
        return userDSProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean db1DSEmFactory(@Qualifier("db1DS") DataSource userDS, EntityManagerFactoryBuilder builder) {
        return builder.dataSource(userDS).packages("lex.example.sinhronisationUKMtoBI.entity.bi").build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager db1DSTransactionManager(EntityManagerFactory db1DsEmFactory) {
        return new JpaTransactionManager(db1DsEmFactory);
    }
}
