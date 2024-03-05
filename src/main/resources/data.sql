-- USE blog;
INSERT INTO `users`(`id`, `email`, `name`, `password`, `username`) VALUES ('1','tohir@gmail.com','Tohir Raihan','$2a$10$EB7tmZrVyHcAn.oYBaedsOTxw.SElAm5QaH0QOFRdM/mpl82GUulW','tohir');
INSERT INTO `users`(`id`, `email`, `name`, `password`, `username`) VALUES ('2','admin@gmail.com','Admin','$2a$10$PY6xqxELTkPOKh0l07L/Re.XDE4lxryYCpe8jMi1xvIdX8q9kO.RK','admin');

INSERT INTO `roles`(`id`, `name`) VALUES ('1','ROLE_USER');
INSERT INTO `roles`(`id`, `name`) VALUES ('2','ROLE_ADMIN');

INSERT INTO `users_roles`(`role_id`, `user_id`) VALUES ('1','1');
INSERT INTO `users_roles`(`role_id`, `user_id`) VALUES ('2','2');