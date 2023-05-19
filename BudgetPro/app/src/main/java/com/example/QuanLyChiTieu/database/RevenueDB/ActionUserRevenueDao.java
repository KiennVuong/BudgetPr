package com.example.QuanLyChiTieu.database.RevenueDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.QuanLyChiTieu.MainApplication.Models.ActionUserRevenueModel;

import java.util.List;

@Dao
public interface ActionUserRevenueDao {
    @Query("DELETE FROM actionrevenueuser WHERE idAction = :idAction")
    void deleteById(int idAction);

    @Insert
    void insertActionUser(ActionUserRevenueModel actionUserModel);

    @Query("SELECT * FROM actionrevenueuser")
    List<ActionUserRevenueModel> getListAction();

}
