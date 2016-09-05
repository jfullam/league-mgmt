
insert into event  (date, home_competitor_name, home_competitor_id, visiting_competitor_name, visiting_competitor_id) VALUES ('2016-04-01 00:00:00', 'Rattlers', 1, 'Astros', 2);


-- Locations
-- =====================================================================

insert into location (street, city, state, zip, description ) values ('12 main street', 'rockaway', 'nj', '07866', 'behind the schoool');
insert into location (street, city, state, zip, description ) values ('50 ballgame blvd', 'newark', 'nj', '09876', null);
insert into location (street, city, state, zip, description ) values ('14 homerun lane', 'roxbury', 'nj', '07876', 'field 12');

-- Event Locations
-- =====================================================================

insert into event_location (event_id, location_id) values (1, 1);
