CREATE TABLE "post" (
                        "id" SERIAL PRIMARY KEY,
                        "name" TEXT NOT NULL DEFAULT '',
                        "description" TEXT NOT NULL DEFAULT ''
);

CREATE TABLE "user" (
                        "id" SERIAL PRIMARY KEY,
                        "fio" TEXT NOT NULL DEFAULT '',
                        "birthday" timestamptz NOT NULL,
                        "email" TEXT DEFAULT '',
                        "phone_number" TEXT NOT NULL DEFAULT '',
                        "post_id" integer REFERENCES "post" ("id")
);

CREATE TABLE "information_for_user" (
                                        "id" SERIAL PRIMARY KEY,
                                        "user_id" integer REFERENCES "user" ("id"),
                                        "post_id" integer REFERENCES "post" ("id")
);