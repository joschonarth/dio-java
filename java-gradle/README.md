# Gradle: Gerenciamento de Dependências e Build em Java

![Gradle Logo](https://gradle.org/assets/images/gradle_logo.png)

Este repositório contém informações e exemplos para ajudá-lo a entender e utilizar o Gradle para gerenciar dependências e realizar builds de projetos Java de maneira eficiente.

## O que é o Gradle?

[Gradle](https://gradle.org/) é uma ferramenta de automação de builds moderna e poderosa que suporta uma ampla gama de linguagens e plataformas. Ele é amplamente utilizado para projetos Java, oferecendo um sistema de build flexível e eficiente, com suporte para gerenciamento de dependências, testes e empacotamento de artefatos.


## Arquivo de Configuração
O Gradle usa um arquivo chamado build.gradle (para Groovy) ou build.gradle.kts (para Kotlin DSL) para definir a configuração do build. Aqui está um exemplo básico de um arquivo build.gradle para um projeto Java:

```bash
plugins {
    id 'java'
}

group 'com.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.13.2'
}
```

Documentação
Para obter mais informações sobre como configurar e utilizar o Gradle, consulte a documentação oficial.