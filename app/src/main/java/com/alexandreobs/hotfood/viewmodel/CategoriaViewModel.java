package com.alexandreobs.hotfood.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.alexandreobs.hotfood.model.pojo.categorias.Categorias;
import com.alexandreobs.hotfood.model.pojo.categorias.Category;
import com.alexandreobs.hotfood.model.repository.CategoriaRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class CategoriaViewModel extends AndroidViewModel {

    private MutableLiveData<List<Category>> listaCategorias = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private CategoriaRepository repository = new CategoriaRepository();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();

    public CategoriaViewModel(@NonNull Application application) {
        super(application);
    }

    private LiveData<List<Category>> getListaCategoria(){
        return this.listaCategorias;
    }

    private LiveData<Boolean> getLoading(){
        return this.loading;
    }
    public void getCategoriasViewModel(String key) {

        disposable.add(
                repository.getCategorias(key)

                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(new Consumer<Disposable>() {
                            @Override
                            public void accept(Disposable disposable) throws Exception {
                                loading.setValue(true);
                            }
                        })
                        .doAfterTerminate(new Action() {
                            @Override
                            public void run() throws Exception {
                                loading.setValue(false);
                            }
                        })
                        .subscribe(new Consumer<Categorias>() {
                                       @Override
                                       public void accept(Categorias Result) throws Exception {
                                           listaCategorias.setValue(Result.getCategories());
                                       }
                                   },
                                new Consumer<Throwable>() {
                                    @Override
                                    public void accept(Throwable throwable) throws Exception {
                                        Log.i("LOG", "Erro" + throwable.getMessage());
                                    }
                                }
                        )
        );

    }
}

