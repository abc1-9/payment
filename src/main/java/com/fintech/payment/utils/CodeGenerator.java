package com.fintech.payment.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * Generate some classes based on the tables in the database
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/payment_db?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8", "root", "123456*")
                .globalConfig(builder -> {
                    builder.author("Liping Wang")
                            .outputDir(System.getProperty("user.dir") + "/src/main/java")
                            .disableOpenDir();
                })
                .packageConfig(builder -> {
                    builder.parent("com.fintech.payment")
                            .entity("entity")
                            .mapper("mapper")
                            .service("service")
                            .controller("controller");
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder()
                            .enableLombok(); // open Lombok
                })
                .templateEngine(new FreemarkerTemplateEngine()) // use Freemarker
                .execute();
    }
}