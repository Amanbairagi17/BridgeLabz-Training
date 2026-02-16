use jdbcpractice;

CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    dob DATE,
    phone VARCHAR(15) UNIQUE,
    email VARCHAR(100) UNIQUE,
    address VARCHAR(255),
    blood_group VARCHAR(5)
);

CREATE TABLE specialties (
    specialty_id INT AUTO_INCREMENT PRIMARY KEY,
    specialty_name VARCHAR(50) NOT NULL
);

CREATE TABLE doctors (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact VARCHAR(15),
    consultation_fee INT,
    specialty_id INT,
    appointment_date DATE,
    is_active BOOLEAN DEFAULT TRUE,

    FOREIGN KEY (specialty_id)
    REFERENCES specialties(specialty_id)
);

CREATE TABLE appointments (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    status VARCHAR(20) DEFAULT 'scheduled',

    FOREIGN KEY (patient_id)
        REFERENCES patients(patient_id),
    FOREIGN KEY (doctor_id)
        REFERENCES doctors(doctor_id)
);

CREATE TABLE visits (
    visit_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_name VARCHAR(100),
    diagnosis VARCHAR(255),
    prescription VARCHAR(255),
    visit_date DATE,

    FOREIGN KEY (patient_id)
        REFERENCES patients(patient_id)
);

CREATE TABLE bills (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    visit_id INT,
    patient_id INT NOT NULL,
    doctor_name VARCHAR(100),
    consultation_fee INT,
    additional_charges INT,
    total_amount INT,
    bill_date DATE,
    payment_status VARCHAR(20) DEFAULT 'unpaid',

    FOREIGN KEY (visit_id)
        REFERENCES visits(visit_id),
    FOREIGN KEY (patient_id)
        REFERENCES patients(patient_id)
);

CREATE TABLE payment_transactions (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    bill_id INT NOT NULL,
    payment_date DATE,
    payment_mode VARCHAR(20),

    FOREIGN KEY (bill_id)
        REFERENCES bills(bill_id)
);

CREATE TABLE audit_log (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(50),
    table_name VARCHAR(50),
    operation VARCHAR(20),
    action_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO specialties (specialty_name)
VALUES ('Cardiology'), ('Neurology'), ('Orthopedics');

INSERT INTO doctors (name, contact, consultation_fee, specialty_id, is_active)
VALUES ('Dr. Test', '9999999999', 500, 1, TRUE);

select * from patients;