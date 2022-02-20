create table hibernate_sequence
(
	next_val bigint null
)
;

create table qsn_set
(
	questionset_id bigint auto_increment
		primary key,
	created_at datetime(6) null,
	questionset_question_ids varchar(255) null,
	questionset_code varchar(255) null
)
;

create table question_tbl
(
	question_id bigint not null
		primary key,
	answer longtext null,
	body longtext null,
	label varchar(255) null,
	line_of_answer int null,
	question_rank int null,
	selected int null,
	marks varchar(15) null
)
;

