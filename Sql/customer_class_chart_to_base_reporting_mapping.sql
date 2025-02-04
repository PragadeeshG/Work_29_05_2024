create table if not exists customer_class_chart_to_base_reporting_mapping(
set_id Integer not null,
customer_class_id Integer null,
ess_base_id Integer null,
department varchar(255) null,
base_reporting_indicator Integer null,
customer_class_mapped_to_report char null,
is_active char null,
master_section_name varchar(255) null,
master_section_type varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint customer_class_chart_to_base_reporting_mapping_pk primary key(set_id));