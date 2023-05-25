CREATE TABLE "post" (
                        "id" SERIAL PRIMARY KEY,
                        "name" TEXT NOT NULL ,
                        "description" TEXT NOT NULL 
);

CREATE TABLE "user" (
                        "id" SERIAL PRIMARY KEY,
                        "fio" TEXT NOT NULL,
                        "birthday" timestamptz NOT NULL,
                        "email" TEXTNOT NULL,
                        "phone_number" TEXT NOT NULL,
                        "post_id" integer REFERENCES "post" ("id")
);

CREATE TABLE "information_for_user" (
                                        "id" SERIAL PRIMARY KEY,
                                        "user_id" integer REFERENCES "user" ("id"),
                                        "post_id" integer REFERENCES "post" ("id")
);
