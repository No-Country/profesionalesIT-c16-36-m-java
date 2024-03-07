USE itprofessionals;
-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO gender (gender_name) 
VALUES ("FEMENINO"),
("MASCULINO"),
("LGBTIQ+"),
("NO DESEO INDICAR");

-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO languages(lang_name)
 VALUES ("ESPAÑOL"),
 ("INGLÉS"),
 ("PORTUGUÉS"),
 ("ALEMÁN"),
 ("FRANCÉS"),
 ("MANDARIN"),
 ("HINDI"),
 ("RUSO"),
 ("JAPONÉS");

-- -----------------------------------------------------
-- dump of table gender 
-- -----------------------------------------------------
INSERT INTO language_levels(LL_level) 
VALUES ("Básico"),
("Intermedio"),
("Avanzado"),
("Nativo");

-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO fields(field_name) 
VALUES ("Ingeniero de software"),
("UX/UI"),
("Desarrollador web"),
("Administrador de sistemas"),
("Ingeniero de redes"),
("Arquitecto de soluciones en la nube"),
("Analista de seguridad de la información"),
("Ingeniero de IA"),
("Científico de datos"),
("Ingeniero de DevOps"),
("Desarrollador de software"),
("Desarrollador back end"),
("Desarrollador front end"),
("Soporte IT"),
("QA"),
("Especialista en ciberseguridad"),
("Desarrollador movil");

-- -----------------------------------------------------
-- dump of table gender 
-- -----------------------------------------------------
INSERT INTO modes (mode_description) 
VALUES ("REMOTO"),
("PRESENCIAL"),
("HIBRIDO");

-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO soft_skills(SS_name)
VALUES ("Resolución de conflictos"),
("Trabajo en equipo"),
("Empatía"),
("Escucha activa"),
("Comunicación efectiva"),
("Organización"),
("Gestión del tiempo"),
("Adaptabilidad"),
("Resiliencia"),
("Autodisciplina"),
("Creatividad"),
("Pensamiento crítico"),
("Flexibilidad"),
("Aprender a aprender"),
("Actitud positiva");

-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO hard_skills(HS_name) 
VALUES ("Java"),
("Python"),
("JavaScript"),
("C++"),
("C#"),
("PHP"),
("Go"),
("Ruby"),
("React"),
("SQL"),
("Agile"),
("Scrum"),
("Spring"),
("Django"),
("Node.js"),
("AWS"),
("Azure"),
("MongoDB"),
("Cassandra"),
("TensorFlow"),
("PyTorch"),
("scikit-learn"),
("Figma"),
("JWT"),
("Oauth"),
("Python");
-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO seniorities (seni_name) 
VALUES ("N/A"),
("TRAINEE"),
("JUNIOR"),
("SEMI SENIOR"),
("SENIOR");

-- -----------------------------------------------------
-- dump of table gender
-- -----------------------------------------------------
INSERT INTO countries (coun_id,coun_name) 
VALUES ("CO","Colombia"),
("AR","Argentina"), 
("CL","Chile"), 
("BO","Bolivia"), 
("BR","Brasil"), 
("CR","Costa Rica"),
("EC","Ecuador"), 
("SV","El Salvador"), 
("HN","Honduras"), 
("MX","México");

-- -----------------------------------------------------
-- dump of table provinces //departments for Colombia
-- -----------------------------------------------------
INSERT INTO provinces (provi_counId,provi_name) 
VALUES ("CO","Antioquia"),
("CO","Atlántico"),
("CO","Bogotá, D.C."),
("CO","Bolívar"),
("CO","Boyacá"), 
("CO","Caldas"),
("CO","Caquetá"),
("CO","Cauca"),
("CO","Cesar"),
("CO","Córdoba"),
("CO","Chocó"),
("CO","Huila"),
("CO","La Guajira"),
("CO","Magdalena"),
("CO","Meta"),
("CO","Nariño"),
("CO","Norte de Santander"),
("CO","Quindío"),
("CO","Risaralda"),
("CO","Santander"),
("CO","Sucre"),
("CO","Tolima"),
("CO","Valle del Cauca"),
("CO","Arauca"),
("CO","Casanare"),
("CO","Putumayo"),
("CO","Amazonas"),
("CO","San Andrés y Providencia"),
("CO","Guainía"),
("CO","Guainía"),
("CO","Guaviare"),
("CO","Vaupés"),
("CO","Vichada");

-- -----------------------------------------------------
-- dump of table provinces //provinces for Argentina
-- -----------------------------------------------------
INSERT INTO provinces (provi_counId,provi_name) 
VALUES ("AR","Buenos Aires"),
("AR","Catamarca"),
("AR","Chaco"),
("AR","Chubut"),
("AR","Córdoba"), 
("AR","Corrientes"),
("AR","Entre Ríos"),
("AR","Formosa"),
("AR","Jujuy"),
("AR","La Pampa"),
("AR","La Rioja"),
("AR","Mendoza"),
("AR","Misiones"),
("AR","Neuquén"),
("AR","Río Negro"),
("AR","San Juan"),
("AR","San Luis"),
("AR","Santa Cruz"),
("AR","Santa Fe"),
("AR","Santiago del Estero"),
("AR","Tierra del Fuego"),
("AR","Tucumán");

-- -----------------------------------------------------
-- dump of table provinces //regions for Chile
-- -----------------------------------------------------
INSERT INTO provinces (provi_counId,provi_name) 
VALUES ("CL","Región de Arica y Parinacota"),
("CL","Región de Tarapacá"),
("CL","Región de Antofagasta"),
("CL","Región de Atacama"),
("CL","Región de Coquimbo"),
("CL","Región de Valparaíso"),
("CL","Región Metropolitana de Santiago"),
("CL","Región de O'Higgins"),
("CL","Región del Maule"),
("CL","Región del Ñuble"),
("CL","Región del Biobío"),
("CL","Región de La Araucanía"),
("CL","Región de Los Ríos"),
("CL","Región de Los Lagos"),
("CL","Región de Aysén del General Carlos Ibáñez del Campo"),
("CL","Región de Magallanes y de la Antártica Chilena");