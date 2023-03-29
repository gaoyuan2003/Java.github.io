Map接口中常用的方法表

| 方法                                | 说明                                          |
| ----------------------------------- | --------------------------------------------- |
| V put(K key,V value)                | 把key与value添加到Map集合中                   |
| void putAll(Map m)                  | 从指定Map中将所有映射关系复制到此Map中        |
| V get(Object key)                   | 根据指定的key,获取对应的value                 |
| V remove(Object key)                | 删除key对应的value                            |
| boolean containsKey(Object key)     | 判断容器中是否包含指定的key                   |
| boolean containsValue(Object value) | 判断容器中是否包含指定的value                 |
| Set keySet()                        | 获取Map集合中所有的key,存储到Set集合中        |
| Set<Map.Entry<K,V>> EntrySet()      | 返回一个Set基于Map.Entry类型包含Map中所有映射 |
| void clear()                        | 删除Map中所有的映射                           |

