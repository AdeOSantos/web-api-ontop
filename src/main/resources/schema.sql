create table if not exists Account (
    user_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name varchar(255),
    surname varchar(255),
    routingNumber number(9),
    nationalId varchar(255),
    accountNumber number(8),
    bankName varchar(255)
);

create table if not exists Transaction (

    wallet_transaction_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    amount bigint,
    user_id bigint

);