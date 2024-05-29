create table if not exists customer_class_chart(
set_id Integer not null,
customer_class_id Integer null,
customer_class_budget_indicator varchar(255) null,
customer_class_sheet varchar(255) null,
customer_class_control_flag varchar(255) null,
customer_class_desc varchar(255) null,
customer_class_short_desc varchar(255) null,
customer_class_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint customer_class_chart_pk primary key(set_id));