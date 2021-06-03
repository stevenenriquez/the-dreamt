CREATE TABLE dream (
    dream_id BIGINT NOT NULL,
    journal_id BIGINT NOT NULL,
    title TEXT NOT NULL,
    content TEXT,
    PRIMARY KEY(dream_id),
    CONSTRAINT fk_journal
        FOREIGN KEY(journal_id)
            REFERENCES journal(journal_id)
)