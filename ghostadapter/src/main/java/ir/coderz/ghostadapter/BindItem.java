package ir.coderz.ghostadapter;

import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sajad on 12/2/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BindItem {
    @LayoutRes
    int layout();

    Class holder() default RecyclerView.ViewHolder.class;

    Class binding() default androidx.databinding.ViewDataBinding.class;
}