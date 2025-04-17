-- 코드를 입력하세요
SELECT a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, SUM(bs.SALES * b.PRICE) AS TOTAL_SALES
FROM BOOK AS b
JOIN AUTHOR AS a ON a.AUTHOR_ID = b.AUTHOR_ID
JOIN BOOK_SALES AS bs ON bs.BOOK_ID = b.BOOK_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY a.AUTHOR_ID, b.CATEGORY
ORDER BY a.AUTHOR_ID ASC, b.CATEGORY DESC;

# select b.author_id, a.author_name, b.category, sum(b.price * s.sales) 'total_sales'
# from book b
#     right join book_sales s
#     on b.book_id = s.book_id
#     left join author a
#     on b.author_id = a.author_id
# where s.sales_date like '2022-01%'
# group by b.category, b.author_id
# order by a.author_id, b.category desc

# SELECT
#     author.AUTHOR_ID,
#     author.AUTHOR_NAME,
#     book.CATEGORY,
#     SUM(sales.SALES * book.PRICE) AS TOTAL_SALES
# FROM
#     BOOK book
#     INNER JOIN AUTHOR author ON book.AUTHOR_ID = author.AUTHOR_ID
#     INNER JOIN BOOK_SALES sales ON book.BOOK_ID = sales.BOOK_ID
# WHERE
#     sales.SALES_DATE LIKE '2022-01%'
# GROUP BY
#     author.AUTHOR_ID,
#     book.CATEGORY
# ORDER BY
#     author.AUTHOR_ID ASC,
#     book.CATEGORY DESC;