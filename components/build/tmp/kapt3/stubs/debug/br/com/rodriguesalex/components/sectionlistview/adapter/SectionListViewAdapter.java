package br.com.rodriguesalex.components.sectionlistview.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/rodriguesalex/components/sectionlistview/adapter/SectionListViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/rodriguesalex/components/sectionlistview/adapter/SectionListViewAdapter$SectionListViewHolder;", "vos", "", "Lbr/com/rodriguesalex/components/sectionlistview/sectionview/vo/SectionViewVo;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SectionListViewHolder", "components_debug"})
public final class SectionListViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.rodriguesalex.components.sectionlistview.adapter.SectionListViewAdapter.SectionListViewHolder> {
    private final java.util.List<br.com.rodriguesalex.components.sectionlistview.sectionview.vo.SectionViewVo> vos = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.rodriguesalex.components.sectionlistview.adapter.SectionListViewAdapter.SectionListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.rodriguesalex.components.sectionlistview.adapter.SectionListViewAdapter.SectionListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SectionListViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.rodriguesalex.components.sectionlistview.sectionview.vo.SectionViewVo> vos) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lbr/com/rodriguesalex/components/sectionlistview/adapter/SectionListViewAdapter$SectionListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lbr/com/rodriguesalex/components/sectionlistview/sectionview/SectionView;", "(Lbr/com/rodriguesalex/components/sectionlistview/adapter/SectionListViewAdapter;Lbr/com/rodriguesalex/components/sectionlistview/sectionview/SectionView;)V", "bind", "", "vo", "Lbr/com/rodriguesalex/components/sectionlistview/sectionview/vo/SectionViewVo;", "components_debug"})
    public final class SectionListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        br.com.rodriguesalex.components.sectionlistview.sectionview.vo.SectionViewVo vo) {
        }
        
        public SectionListViewHolder(@org.jetbrains.annotations.NotNull()
        br.com.rodriguesalex.components.sectionlistview.sectionview.SectionView itemView) {
            super(null);
        }
    }
}