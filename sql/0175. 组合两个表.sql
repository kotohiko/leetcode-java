# 175. 组合两个表
# URL：https://leetcode.cn/problems/combine-two-tables/
# 注：此SQL文件是DML、DQL、DDL共存的，若需做试验请谨慎操作

# SQL架构
CREATE TABLE IF NOT EXISTS person
(
    personid  INT,
    firstname VARCHAR(255),
    lastname  VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS address
(
    addressid INT,
    personid  INT,
    city      VARCHAR(255),
    state     VARCHAR(255)
);
TRUNCATE TABLE person;
INSERT INTO person (personid, lastname, firstname)
VALUES ('1', 'Wang', 'Allen');
INSERT INTO person (personid, lastname, firstname)
VALUES ('2', 'Alice', 'Bob');
TRUNCATE TABLE address;
INSERT INTO address (addressid, personid, city, state)
VALUES ('1', '2', 'New York City', 'New York');
INSERT INTO address (addressid, personid, city, state)
VALUES ('2', '3', 'Leetcode', 'California');

# 题目解答
SELECT firstname, lastname, city, state
FROM person p
         LEFT JOIN address a ON a.personid = p.personid;