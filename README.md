# baking-soda

Baking-soda-material-ui is an interface between
clojurescript's [reagent](https://github.com/reagent-project/reagent)
and [material-ui](https://material-ui-next.com/) (i.e., material-ui 1.0 react components).


## Usage 

Put the following in the `:dependencies` vector of your *project.clj*

```clojure
[cljsjs/react "16.3.2-0"]
[cljsjs/react-dom "16.3.2-0" :exclusions [cljsjs/react]]
[reagent "0.8.0" :exclusions [cljsjs/react
                              cljsjs/react-dom]]
[alexeypopov/baking-soda-material-ui "0.0.1-SNAPSHOT" :exclusions [cljsjs/react
                                                                   cljsjs/react-dom
                                                                   cljsjs/reagent]]
```

Then require baking-soda in your namespace.

```clojure
(ns foo.bar
  (:require [baking-soda-material-ui.core :as bsmu]))
```

### Example

Let's take a look at a modal. In javascript, you'd write something like this:

```jsx
/* eslint react/no-multi-comp: 0, react/prop-types: 0 */

import React from 'react';
import ReactDOM from 'react-dom';
import Button from '@material-ui/core/Button';

function App() {
  return (
    <Button variant="raised" color="primary">
      Hello World
    </Button>
  );
}
```

However, in clojurescript with baking-soda, you'd write something like this:

```clojure
(ns foo.bar
  (:require
   [reagent.core :as reagent]
   [baking-soda-material-ui.core :as bsmu :refer [Button]]))


(defn app []
 [:div
  [Button {:variant "raised"
           :color "primari"}
           "Hello World"]])
```

# License

Copyright © 2018 Guliy Anatoliy, Alexey Popov
Based on [baking-soda](https://github.com/gadfly361/baking-soda) by Matthew Jaoudi

Distributed under the The MIT License (MIT).
