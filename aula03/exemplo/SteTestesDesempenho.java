package exemplo;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({TesteDivisao.class, TesteRaiz.class})
@ExcludeCategory({TesteFuncional.class, TesteDeExcecao.class})
public class SteTestesDesempenho {

}
