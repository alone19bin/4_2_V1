-- Создание справочника стран
INSERT INTO person.countries (name, alpha2, alpha3, status, created, updated)
VALUES 
    ('Российская Федерация', 'RU',   'RUS', 'ACTIVE', NOW(), NOW()),
    ('Соединенные Штаты Америки', 'US', 'USA', 'ACTIVE', NOW(), NOW()),
    ('Китайская Народная Республика',   'CN', 'CHN', 'ACTIVE', NOW(), NOW()),
    ('Германия', 'DE', 'DEU', 'ACTIVE', NOW(), NOW()),
    ('Франция', 'FR', 'FRA', 'ACTIVE', NOW(), NOW()),
    ('Великобритания', 'GB',  'GBR', 'ACTIVE', NOW(), NOW()),
    ('Канада', 'CA', 'CAN', 'ACTIVE', NOW(), NOW()),
    ('Бразилия', 'BR', 'BRA', 'ACTIVE', NOW(), NOW()),
    ('Индия', 'IN', 'IND', 'ACTIVE', NOW(), NOW()),
    ('Япония', 'JP', 'JPN', 'ACTIVE', NOW(), NOW());