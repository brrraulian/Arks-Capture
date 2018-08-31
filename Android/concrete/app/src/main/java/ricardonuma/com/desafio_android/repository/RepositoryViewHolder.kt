package ricardonuma.com.desafio_android.repository

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import ricardonuma.com.desafio_android.R
import ricardonuma.com.desafio_android.widget.SquareImageView

/**
 * Created by ricardonuma on 12/21/17.
 */


internal class RepositoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val mTitle: TextView
    val mDescription: TextView
    val mFork: TextView
    val mStar: TextView

    val mImageView: SquareImageView
    val mUsername: TextView

    val mConstraintLayout: ConstraintLayout
    val mProgressBar: ProgressBar

    init {
        mTitle = itemView.findViewById(R.id.tv_title)
        mDescription = itemView.findViewById(R.id.tv_description)
        mFork = itemView.findViewById(R.id.tv_fork)
        mStar = itemView.findViewById(R.id.tv_star)

        mImageView = itemView.findViewById(R.id.iv_user)
        mUsername = itemView.findViewById(R.id.tv_username)

        mConstraintLayout = itemView.findViewById(R.id.cl_layout)
        mProgressBar = itemView.findViewById(R.id.pb_load)
    }
}