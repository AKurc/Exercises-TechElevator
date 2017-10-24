DROP TABLE IF EXISTS cards;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS products;

CREATE TABLE categories
(
	id		serial,
	name	varchar(100)	not null,

	constraint pk_categories primary key (id)
);

CREATE TABLE cards
(
	id			serial,
	card_name		varchar(255)	not null,
	price		decimal(10,2)		not null,
	description	text		not null,
	category_id	int,
	image		varchar(255)	not null,

	constraint pk_products primary key (id),
	constraint fk_products_categories foreign key (category_id) references categories(id)
);

insert into categories (name) VALUES ('Relationship');
insert into categories (name) VALUES ('Pet Passing');
insert into categories (name) VALUES ('Empathy');
insert into categories (name) VALUES ('Oops');



insert into cards (card_name, price, description, category_id, image) values ('Relationship Card', '4.00', 'I am not going anywhere, so I hope you are okay with that. Because I love you.', 1, 'http://dummyimage.com/250x250.png/5fa2dd/ffffff');
insert into cards (card_name, price, description, category_id, image) values ('Pet Passing Card', '4.00', 'Squirrels run slower in heaven', 2, 'http://dummyimage.com/250x250.png/dddddd/000000');
insert into cards (card_name, price, description, category_id, image) values ('Empathy Card', '4.00', 'I wish I could take away your pain. Or, at least take away the people who compare it to the time their hamster died.', 3, 'http://dummyimage.com/250x250.png/5fa2dd/ffffff');
insert into cards (card_name, price, description, category_id, image) values ('Oops Card', '4.00', 'OOPS!!! Some days you should just stay in bed.', 4, 'http://dummyimage.com/250x250.png/5fa2dd/ffffff');
