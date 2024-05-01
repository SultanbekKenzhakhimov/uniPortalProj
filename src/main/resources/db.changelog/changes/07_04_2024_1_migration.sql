-- Миграция для создания таблицы universities
CREATE TABLE universities (
                              id SERIAL PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              email VARCHAR(255),
                              address VARCHAR(255),
                              description VARCHAR(5000),
                              pic_name VARCHAR(255)
);
-- Migration to create the faculties table
CREATE TABLE faculties (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           description VARCHAR(5000),
                           university_id BIGINT,
                           CONSTRAINT fk_university
                               FOREIGN KEY (university_id)
                                   REFERENCES universities(id)
);
-- Migration to create the Specializations table
CREATE TABLE specializations (
                                 id SERIAL PRIMARY KEY,
                                 name VARCHAR(255) NOT NULL,
                                 description VARCHAR(5000),
                                 faculty_id BIGINT,
                                 CONSTRAINT fk_faculty
                                     FOREIGN KEY (faculty_id)
                                         REFERENCES faculties(id)
);

-- Inserting real universities of Kazakhstan into the universities table
INSERT INTO universities (name, email, address, description, pic_name) VALUES
                                                                           ('Al-Farabi Kazakh National University',
                                                                            'info@kaznu.kz',
                                                                            '71 Al-Farabi Ave, Almaty, 050040, Kazakhstan',
                                                                            'Al-Farabi Kazakh National University, founded in 1933, stands as the largest and oldest university in Kazakhstan, proudly carrying the legacy of its namesake, renowned philosopher Al-Farabi. Spanning over eight decades of academic excellence, the university has evolved into a beacon of knowledge, innovation, and cultural enrichment. Offering a diverse spectrum of educational programs across disciplines such as humanities, sciences, engineering, social sciences, and medicine, it fosters an environment that encourages intellectual curiosity, critical thinking, and creativity. The university''s commitment to research, innovation, and community engagement extends beyond borders, making significant contributions to global academia and societal development. With state-of-the-art facilities, distinguished faculty, and vibrant campus life, Al-Farabi Kazakh National University continues to nurture generations of leaders, scholars, and changemakers.',
                                                                            'kaznu.jpg'),

                                                                           ('Satbayev University',
                                                                            'info@ntu.kz',
                                                                            '22 Satpayev St, Almaty, 050013, Kazakhstan',
                                                                            'Satbayev University, formerly known as the Kazakh National Technical University, stands at the forefront of technical education and research in Kazakhstan. Established in 1934, the university has played a pivotal role in shaping the nation''s technological landscape and driving innovation across various industries. With a relentless pursuit of excellence, Satbayev University offers a comprehensive range of programs in engineering, technology, natural sciences, and applied disciplines. Its cutting-edge research facilities, industry partnerships, and international collaborations provide students with unparalleled opportunities for academic and professional growth. The university''s emphasis on practical learning, entrepreneurship, and interdisciplinary collaboration equips graduates with the skills and mindset needed to address complex challenges and drive sustainable development. As a hub of innovation and creativity, Satbayev University continues to inspire future generations of engineers, scientists, and innovators.',
                                                                            'ntu.jpg'),

                                                                           ('L.N. Gumilyov Eurasian National University',
                                                                            'info@enu.kz',
                                                                            '2 L.N. Gumilyov Ave, Nur-Sultan, 010008, Kazakhstan',
                                                                            'L.N. Gumilyov Eurasian National University, established in 1996, stands as a testament to Kazakhstan''s commitment to excellence in higher education and research. Named after the renowned philosopher and historian Lev Gumilyov, the university embodies his spirit of intellectual curiosity, cultural diversity, and global connectivity. With a wide array of undergraduate, graduate, and doctoral programs across disciplines such as humanities, social sciences, natural sciences, and business, it offers students a transformative educational experience. The university''s state-of-the-art campus, modern facilities, and dynamic learning environment foster creativity, critical thinking, and leadership skills. Through its innovative research initiatives, international collaborations, and community engagement efforts, L.N. Gumilyov Eurasian National University strives to address pressing global challenges and contribute to the advancement of knowledge and human welfare.',
                                                                            'enu.jpg'),

                                                                           ('Kazakh National Research Technical University named after K.I. Satpayev',
                                                                            'info@kazntu.kz',
                                                                            '22 Satpayev St, Almaty, 050013, Kazakhstan',
                                                                            'Kazakh National Research Technical University named after K.I. Satpayev, founded in 1934, holds a prominent position as one of the oldest and most prestigious technical universities in Kazakhstan. Named after the renowned scientist and public figure Kanysh Satpayev, the university upholds a rich legacy of scientific discovery, innovation, and academic excellence. Offering a comprehensive range of programs in engineering, technology, natural sciences, and related fields, it provides students with a rigorous academic curriculum, hands-on practical experience, and opportunities for research and innovation. The university''s state-of-the-art laboratories, research centers, and industry partnerships create a dynamic learning environment that prepares graduates to excel in their chosen fields and make meaningful contributions to society.',
                                                                            'kazntu.jpg'),

                                                                           ('S.D. Asfendiyarov Kazakh National Medical University',
                                                                            'info@kaznmu.kz',
                                                                            '94 Tole bi St, Almaty, 050035, Kazakhstan',
                                                                            'S.D. Asfendiyarov Kazakh National Medical University, established in 1930, holds a distinguished reputation as one of the leading medical institutions in Kazakhstan. Named after the eminent scientist and educator S.D. Asfendiyarov, the university has been instrumental in shaping the nation''s healthcare landscape and producing skilled healthcare professionals. With a strong emphasis on academic excellence, clinical training, and research, it offers a wide range of programs in medicine, dentistry, pharmacy, nursing, and allied health sciences. The university''s state-of-the-art medical facilities, experienced faculty, and collaborative learning environment ensure that graduates are well-prepared to meet the evolving healthcare needs of society and contribute to the advancement of medical science and practice.',
                                                                            'kaznmu.jpg');