package io.github.importre.rfp.main

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.importre.rfp.R
import io.github.importre.rfp.api.repo.Repository
import io.github.importre.rfp.ext.getTagAsImageView
import io.github.importre.rfp.ext.getTagAsTextView
import io.github.importre.rfp.ext.loadUrl

class RepoViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setRepo(repo: Repository) {
        view.getTagAsImageView(R.id.ownerImage).loadUrl(repo.owner.avatarUrl)
        view.getTagAsTextView(R.id.name).text = repo.name
        view.getTagAsTextView(R.id.star).text = "${repo.stargazersCount}"
        view.getTagAsTextView(R.id.fork).text = "${repo.forksCount}"
    }
}