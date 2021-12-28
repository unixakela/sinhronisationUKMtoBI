package lex.example.sinhronisationUKMtoBI.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"lex.example.sinhronisationUKMtoBI.repository.ukm"},
        entityManagerFactoryRef = "db2DSEntityManager",
        transactionManagerRef = "db2DSTransactionMAnager")
public class DB2_DataSource {

    @Bean
    @ConfigurationProperties("spring.datasource2")
    public DataSourceProperties db2DSProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource db2DS(@Qualifier("db2DSProperties") DataSourceProperties productDSProperties) {
        return productDSProperties.initializeDataSourceBuilder().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean db2DSEntityManager(@Qualifier("db2DS") DataSource db2DS, EntityManagerFactoryBuilder builder) {
        return builder.dataSource(db2DS).packages("lex.example.sinhronisationUKMtoBI.entity.ukm").build();
    }

    @Bean
    public PlatformTransactionManager db2DSTransactionMAnager(EntityManagerFactory db2DSEmFactory) {
        return new JpaTransactionManager(db2DSEmFactory);
    }


}
