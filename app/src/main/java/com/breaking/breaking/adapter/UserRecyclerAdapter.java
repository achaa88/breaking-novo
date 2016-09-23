package com.breaking.breaking.adapter;

/**
 * Created by Ellen on 17/06/2016.
 */

        import com.firebase.ui.database.FirebaseRecyclerAdapter;
        import com.google.firebase.database.Query;

        import com.breaking.breaking.domain.User;

public class UserRecyclerAdapter extends FirebaseRecyclerAdapter<User, UserViewHolder> {

    public UserRecyclerAdapter(
            Class<User> modelClass,
            int modelLayout,
            Class<UserViewHolder> viewHolderClass,
            Query ref ){
        super( modelClass, modelLayout, viewHolderClass, ref );
    }
    @Override
    protected void populateViewHolder(
            UserViewHolder userViewHolder,
            User user, int i) {
        userViewHolder.text1.setText( user.getName() );
        userViewHolder.text2.setText( user.getEmail() );
    }
}