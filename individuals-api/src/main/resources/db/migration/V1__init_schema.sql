-- Создание схемы
CREATE SCHEMA IF NOT EXISTS person;

-- Включение расширений
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";


-- Справочник стран
CREATE TABLE IF NOT EXISTS person.countries (
                                                id SERIAL PRIMARY KEY,
                                                created TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                                                updated TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                                                name VARCHAR(32) NOT NULL,
                                                alpha2 VARCHAR(2) NOT NULL,
                                                alpha3 VARCHAR(3) NOT NULL,
                                                status VARCHAR(32) NOT NULL
);

-- Таблица адресов
CREATE TABLE IF NOT EXISTS person.addresses (
                                                id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                                                created TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                updated TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                country_id INTEGER REFERENCES person.countries (id),
                                                address VARCHAR(128) NOT NULL,
                                                zip_code VARCHAR(32),
                                                archived TIMESTAMP WITH TIME ZONE,
                                                city VARCHAR(32) NOT NULL,
                                                state VARCHAR(32)
);

-- Таблица пользователей
CREATE TABLE IF NOT EXISTS person.users (
                                            id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                                            secret_key VARCHAR(32),
                                            email VARCHAR(1024) NOT NULL UNIQUE,
                                            created TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                            updated TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                            first_name VARCHAR(32) NOT NULL,
                                            last_name VARCHAR(32) NOT NULL,
                                            filled BOOLEAN DEFAULT FALSE,
                                            address_id UUID REFERENCES person.addresses(id)
);

-- Таблица индивидуалов
CREATE TABLE IF NOT EXISTS person.individuals (
                                                  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                                                  user_id UUID UNIQUE NOT NULL REFERENCES person.users(id),
                                                  passport_number VARCHAR(32) NOT NULL UNIQUE,
                                                  phone_number VARCHAR(32) NOT NULL UNIQUE,
                                                  email VARCHAR(32) NOT NULL UNIQUE,
                                                  verified_at TIMESTAMP WITH TIME ZONE NOT NULL,
                                                  archived_at TIMESTAMP WITH TIME ZONE,
                                                  status VARCHAR(32) NOT NULL DEFAULT 'ACTIVE'
);

-- Таблица истории пользователей
CREATE TABLE IF NOT EXISTS person.user_history (
                                                   id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                                                   created TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                   user_id UUID NOT NULL REFERENCES person.users(id),
                                                   user_type VARCHAR(32) NOT NULL,
                                                   reason VARCHAR(255),
                                                   comment VARCHAR(255),
                                                   changed_values JSONB
);