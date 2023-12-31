package com.ideaco.diabatch4.repository;

import com.ideaco.diabatch4.model.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobModelRepository extends JpaRepository<JobModel, Long> {
    // JpaRepository merupakan turunan dari Spring Data JPA yang menyediakan fungsionalitas dasar untuk melakukan
    // operasi CRUD terhadap entitas yang diberikan.
    // Kode ini memanfaatkan kekuatan dari Spring Data JPA yang memungkinkan pembuatan metode query tanpa perlu
    // menuliskan query SQL secara eksplisit, sehingga mempermudah akses data dan operasi CRUD pada entitas JobModel.


    // Penamaan metode seperti findByUserEmailAndUserPassword dan findByUserEmail
    // adalah contoh dari konvensi penamaan di Spring Data JPA yang memungkinkan pembuatan query
    // tanpa menuliskan query SQL secara eksplisit.
    // Framework ini akan secara otomatis menerjemahkan nama metode menjadi query yang sesuai.
    // findByUserEmailAndUserPassword: Mencari JobModel berdasarkan userEmail dan userPassword.
    // findByUserEmail: Mencari JobModel berdasarkan userEmail.
    boolean findByUserEmailAndUserPassword(String userEmail, String userPassword);
    JobModel findByUserEmail(String userEmail);
}
