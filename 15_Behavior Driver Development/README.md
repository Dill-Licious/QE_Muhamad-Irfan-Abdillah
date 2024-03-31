# (15) Behavior Driver Development

## Apa itu BDD (Behavior-Driven Development) ?
BDD adalah pendekatan pengembangan perangkat lunak yang menekankan kolaborasi untuk merumuskan cerita pengguna dalam bahasa universal. Fokusnya adalah pada perilaku sistem dengan menggunakan bahasa alami dalam skenario pengujian untuk menggambarkan perilaku yang diharapkan.

## Apa itu TDD (Test-Driven Development)? 
TDD adalah pendekatan pengembangan perangkat lunak di mana pengujian otomatis dibuat sebelum kode implementasi. Ini melibatkan menulis tes terlebih dahulu untuk menggambarkan perilaku yang diinginkan, diikuti dengan menulis kode yang memenuhi tes tersebut. TDD memastikan setiap fitur diuji secara menyeluruh sebelum implementasi dan mengurangi kebutuhan untuk debug di tahap akhir.

## BDD Format
1. User Story
2. As a [X] I want [Y] So that [Z]
3. Scenario
4. Given, When, Then

## BDD with Cucumber
1. Write Storu -> Gherkin Syntax (Given, When, Than)
2. Map Steps to Java -> Configure steps script and validation
3. Configure Stories -> Combine stories and steps
4. Run Stories -> IntelliJ IDEA, maven
5. View Report

Lihat report:
```
mvn clean verify
```
