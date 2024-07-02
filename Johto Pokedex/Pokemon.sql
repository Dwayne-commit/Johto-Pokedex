/*
create database dex;

use dex;

create table dex(num int, name varchar(50), species varchar(50), type varchar(50), type2 varchar(50), atk int, def int, spd int, fav varchar(50));


insert into dex(num, name, type, type2, atk, def, spd, fav) values(006, 'Totodile', 'Water', 'none', 65, 64, 100, '-');


insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(013, 'Noctowl', 'Owl pokemon', 'Normal', 'Flying', 50, 50, 70, '-');

create table fav(num int, name varchar(50), species varchar(50), type varchar(50), type2 varchar(50), atk int, def int, spd int, fav varchar(50), save varchar(50));


insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(001, 'Chikorita', 'Leaf pokemon', 'Grass', '-', 49, 65, 45, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(002, 'Bayleef', 'Leaf pokemon', 'Grass', '-', 62, 80, 60, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(003, 'Meganium', 'Herb pokemon', 'Grass', '-', 82, 100, 80, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(004, 'Cyndaquil', 'Fire Mouse pokemon', 'Fire', '-', 52, 43, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(005, 'Quilava', 'Volcano pokemon', 'Fire', '-', 64, 58, 80, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(006, 'Typhlosion', 'Volcano pokemon', 'Fire', '-', 84, 78, 100, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(007, 'Totodile', 'Big Jaw pokemon', 'Water', '-', 65, 64, 43, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(008, 'Croconaw', 'Big Jaw pokemon', 'Water', '-', 80, 80, 58, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(009, 'Feraligatr', 'Big Jaw pokemon', 'Water', '-', 105, 100, 78, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(010, 'Sentret', 'Scout pokemon', 'Normal', '-', 46, 34, 20, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(011, 'Furret', 'Long Body pokemon', 'Normal', '-', 76, 64, 90, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(012, 'Hoothoot', 'Owl pokemon', 'Normal', 'Flying', 30, 30, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(013, 'Noctowl', 'Owl pokemon', 'Normal', 'Flying', 50, 50, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(014, 'Ledyba', 'Five Star Pokemon', 'Bug', 'Flying', 20, 30, 55, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(015, 'Ledian', 'Five Star Pokemon', 'Bug', 'Flying', 35, 50, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(016, 'Spinark', 'String Spit Pokemon', 'Bug', 'Poison', 60, 40, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(017, 'Ariados', 'Long Leg Pokemon', 'Bug', 'Poison', 90, 70, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(018, 'Crobat', 'Bat Pokemon', 'Posion', 'Flying', 90, 80, 130, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(019, 'Chinchou', 'Angler Pokemon', 'Water', 'Electric', 38, 38, 67, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(020, 'Lanturn', 'Light Pokemon', 'Water', 'Electric', 58, 58, 67, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(021, 'Pichu', 'Tiny Mouse Pokemon', 'Electric', '-', 40, 15, 60, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(022, 'Cleffa', 'Star Shape Pokemon', 'Fairy', '-', 25, 28, 15, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(023, 'Igglybuff', 'Ballon Pokemon', 'Normal', 'Fairy', 30, 30, 15, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(024, 'Togepi', 'Spike Ball Pokemon', 'Fairy', '-', 20, 65, 20, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(025, 'Togetic', 'Happiness Pokemon', 'Fairy', 'Flying', 40, 85, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(026, 'Natu', 'Tiny Bird Pokemon', 'Psychic', 'Flying', 50, 45, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(027, 'Xatu', 'Mystic Pokemon', 'Psychic', 'Flying', 75, 70, 95, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(028, 'Mareep', 'Wool Pokemon', 'Electric', '-', 40, 40, 35, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(029, 'Flaffy', 'Wool Pokemon', 'Electric', '-', 55, 55, 45, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(030, 'Ampharos', 'Light Pokemon', 'Electric', '-', 75, 85, 55, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(031, 'Bellosmon', 'Flower Pokemon', 'Grass', '-', 80, 95, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(032, 'Marill', 'Aqua Mouse Pokemon', 'Water', 'Fairy', 20, 50, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(033, 'Azumarill', 'Aqua Rabbit Pokemon', 'Water', 'Fairy', 50, 80, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(034, 'Sudowoodo', 'Imitation Pokemon', 'Rock', '-', 100, 115, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(035, 'Politoed', 'Frog Pokemon', 'Water', '-', 75, 75, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(036, 'Hoppip', 'Cottonweed Pokemon', 'Grass', 'Flying', 35, 40, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(037, 'Skiploom', 'Cottonweed Pokemon', 'Grass', 'Flying', 45, 50, 80, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(038, 'Jumpluff', 'Cottonweed Pokemon', 'Grass', 'Flying', 55, 70, 110, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(039, 'Aipom', 'Long Tail Pokemon', 'Normal', '-', 70, 55, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(040, 'Sunkern', 'Seed Pokemon', 'Grass', '-', 30, 30, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(041, 'Sunflora', 'Sun Pokemon', 'Grass', '-', 75, 55, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(042, 'Yanma', 'Clear Wing Pokemon', 'Bug', 'Flying', 65, 45, 95, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(043, 'Wooper', 'Water Fish Pokemon', 'Water', 'Ground', 45, 45, 15, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(044, 'Quagsire', 'Water Fish Pokemon', 'Water', 'Ground', 85, 85, 35, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(045, 'Espeon', 'Sun Pokemon', 'Psychic', '-', 65, 60, 110, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(046, 'Umbreon', 'Moonlight Pokemon', 'Dark', '-', 65, 110, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(047, 'Murkrow', 'Darkness Pokemon', 'Dark', 'Flying', 85, 42, 91, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(048, 'Slowking', 'Royal Pokemon', 'Water', 'Psychic', 75, 80, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(049, 'Misdreavus', 'Screech Pokemon', 'Ghost', '-', 60, 60, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(050, 'Unown', 'Symbol Pokemon', 'Psychic', '-', 72, 48, 48, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(051, 'Wobbuffet', 'Patient Pokemon', 'Psychic', '-', 33, 58, 33, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(052, 'Girafarig', 'Long Neck Pokemon', 'Normal', 'Psychic', 80, 65, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(053, 'Pineco', 'Bagworm Pokemon', 'Bug', '-', 65, 90, 15, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(054, 'Forretress', 'Bagworm Pokemon', 'Bug', 'Steel', 90, 140, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(055, 'Dunsparce', 'Land Sanke Pokemon', 'Normal', '-', 70, 70, 45, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(056, 'Gligar', 'FlyScorpion Pokemon', 'Ground', 'Flying', 75, 105, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(057, 'Steelix', 'Iron Snake Pokemon', 'Steel', 'Ground', 85, 200, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(058, 'Snubbull', 'Fairy Pokemon', 'Fairy', '-', 80, 50, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(059, 'Granbull', 'Fairy Pokemon', 'Fairy', '-', 120, 75, 45, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(060, 'Qwilfish', 'Balloon Pokemon', 'Water', 'Poison', 95, 85, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(061, 'Scizor', 'Pincer Pokemon', 'Bug', 'Steel', 130, 100, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(062, 'Shuckle', 'Mold Pokemon', 'Bug', 'Rock', 10, 230, 5, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(063, 'Heracross', 'Single Horn Pokemon', 'Bug', 'Fighting', 125, 75, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(064, 'Sneasel', 'Sharp Claw Pokemon', 'Dark', 'Ice', 95, 55, 115, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(065, 'Teddiursa', 'Little Bear Pokemon', 'Normal', '-', 80, 50, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(066, 'Ursaring', 'Hibernator Pokemon', 'Normal', '-', 130, 75, 55, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(067, 'Slugma', 'Lava Pokemon', 'Fire', '-', 40, 40, 20, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(068, 'Magcargo', 'Lava Pokemon', 'Fire', 'Rock', 50, 120, 30, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(069, 'Swinub', 'Pig Pokemon', 'Ice', 'Ground', 50, 40, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(070, 'Piloswine', 'Swine Pokemon', 'Ice', 'Ground', 100, 80, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(071, 'Corsola', 'Coral Pokemon', 'Water', 'Rock', 55, 95, 35, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(072, 'Remoraid', 'Jet Pokemon', 'Water', '-', 65, 35, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(073, 'Octillery', 'Jet Pokemon', 'Water', '-', 105, 75, 45, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(074, 'Delibird', 'Delivery Pokemon', 'Ice', 'Flying', 55, 45, 75, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(075, 'Mantine', 'Kite Pokemon', 'Water', 'Flying', 40, 70, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(076, 'Skarmory', 'Armor Bird Pokemon', 'Steel', 'Flying', 80, 140, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(077, 'Houndour', 'Dark Pokemon', 'Dark', 'Fire', 60, 30, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(078, 'Houndoom', 'Dark Pokemon', 'Dark', 'Fire', 90, 50, 95, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(079, 'Kingdra', 'Dragon Pokemon', 'Water', 'Dragon', 95, 95, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(080, 'Phanpy', 'Long Nose Pokemon', 'Ground', '-', 60, 60, 40, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(081, 'Donphan', 'Armor Pokemon', 'Ground', '-', 120, 120, 50, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(082, 'Porygon2', 'Virtual Pokemon', 'Normal', '-', 80, 90, 60, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(083, 'Stantler', 'Big Horn Pokemon', 'Normal', '-', 95, 62, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(084, 'Smeargle', 'Painter Pokemon', 'Normal', '-', 20, 35, 75, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(085, 'Tyrogue', 'Scuffle Pokemon', 'Fighting', '-', 35, 35, 35, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(086, 'Hitmontop', 'Handstand Pokemon', 'Fighting', '-', 95, 95, 70, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(087, 'Smoochum', 'Kiss Pokemon', 'Ice', 'Psychic', 30, 15, 65, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(088, 'Elekid', 'Electric Pokemon', 'Grass', '-', 63, 37, 95, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(089, 'Magby', 'Live Coal Pokemon', 'Fire', '-', 75, 37, 83, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(090, 'Miltank', 'Milk Cow Pokemon', 'Normal', '-', 80, 105, 100, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(091, 'Blissey', 'Happiness Pokemon', 'Normal', '-', 10, 10, 55, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(092, 'Raikou', 'Thunder Pokemon', 'Electric', '-', 85, 75, 115, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(093, 'Entei', 'Volcano Pokemon', 'Fire', '-', 115, 85, 100, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(094, 'Suicune', 'Aurora Pokemon', 'Water', '-', 75, 115, 85, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(095, 'Larvitar', 'Rock Skin Pokemon', 'Rock', 'Ground', 64, 50, 41, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(096, 'Pupitar', 'Hard Shell Pokemon', 'Rock', 'Ground', 84, 70, 51, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(097, 'Tyranitatr', 'Armor Pokemon', 'Rock', 'Dark', 134, 110, 61, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(098, 'Lugia', 'Diving Pokemon', 'Psychic', 'Flying', 90, 130, 110, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(099, 'Ho-oh', 'Rainbow Pokemon', 'Fire', 'Flying', 130, 90, 90, '-');
insert into dex(num, name, species, type, type2, atk, def, spd, fav) values(100, 'Celebi', 'Time Travel Pokemon', 'Psychic', 'Grass', 100, 100, 100, '-');
*/