package com.ideaco.diabatch4.service;

import com.ideaco.diabatch4.model.JobModel;
import com.ideaco.diabatch4.repository.JobModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // : Menandakan bahwa kelas ini adalah bagian dari lapisan service dalam arsitektur aplikasi.
public class JobService {

    private final JobModelRepository jobModelRepository;

    // Lalu saya menggunakan anotasi @Autowired untuk melakukan injection
    // pada constructor dengan JobModelRepository, sehingga JobService
    // dapat menggunakan fungsionalitas yang disediakan oleh repository.
    @Autowired
    public JobService(JobModelRepository jobModelRepository) {
        this.jobModelRepository = jobModelRepository;
    }

    // Operasi Login
    // Menggunakan repository untuk melakukan pencarian pengguna berdasarkan email dan password.
    public boolean login(String userEmail, String userPassword) {
        return jobModelRepository.findByUserEmailAndUserPassword(userEmail, userPassword);
    }

    // Operasi Register
    // Menyimpan data pengguna baru ke dalam basis data dengan menggunakan repository.
    public JobModel register(JobModel jobModel) {
        // Implementasi validasi atau logika lain sebelum menyimpan data
        return jobModelRepository.save(jobModel);
    }

    // Get User berdasarkan Email
    // getUserByEmail Mengambil pengguna berdasarkan email.
    public JobModel getUserByEmail(String userEmail) {
        return jobModelRepository.findByUserEmail(userEmail);
    }

    // Get All Users
    // getAllUsers Mengambil daftar semua pengguna.
    public List<JobModel> getAllUsers() {
        return jobModelRepository.findAll();
    }

    public JobModel getUserById(Long userId) {
        return null;
    }
}
