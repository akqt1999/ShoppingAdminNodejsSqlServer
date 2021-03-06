package etn.app.danghoc.shoppingadmin.retrofit;

import etn.app.danghoc.shoppingadmin.model.SanPhamModel;
import etn.app.danghoc.shoppingadmin.model.UpdateAdminModel;
import etn.app.danghoc.shoppingadmin.model.AdminModel;
import etn.app.danghoc.shoppingadmin.model.UpdateStatusUserModel;
import etn.app.danghoc.shoppingadmin.model.UserModel;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IMyShoppingAPI {
    @GET("admin")
    Observable<AdminModel> getAdmin(@Query("key") String apiKey,
                                    @Query("IdAdmin") String IdAdmin);

    @POST("admin")
    @FormUrlEncoded
    Observable<UpdateAdminModel> updateUserInfo(@Field("key") String apiKey,
                                                @Field("AdminPhone") String userPhone,
                                                @Field("AdminName") String adminName,
                                                @Field("IdAdmin") String fbid);

    @GET("searchUser")
    Observable<UserModel> searchUser(@Query("key") String apiKey,
                                     @Query("UserPhone")String phone);

    @GET("userforadmin")
    Observable<UserModel> getUserForAdmin(@Query("key") String apiKey);

    @POST("updateStatusUser")
    @FormUrlEncoded
    Observable<UpdateStatusUserModel> updateStatusUser(@Field("key") String apiKey,
                                                       @Field("idUser") String iduser,

                                                           @Field("TrangThai") int status);

    @GET("sanPhamByIdUser")
    Observable<SanPhamModel> getSanPhamByUser(@Query("key") String apiKey,
                                              @Query("IdUser") String IdUser);


}
