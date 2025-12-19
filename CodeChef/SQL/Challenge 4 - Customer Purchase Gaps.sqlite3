WITH sorted AS
(
    SELECT customer_id
        , JULIANDAY( order_date ) AS order_date
        , LAG ( JULIANDAY( order_date ) ) OVER
        (
            PARTITION BY customer_id
            ORDER BY order_date
        ) AS prev_date
    FROM Orders
)

SELECT customer_id
    , name
    , MAX( order_date - prev_date ) AS max_gap_days
FROM sorted
JOIN Customers USING ( customer_id )
WHERE prev_date IS NOT NULL
GROUP BY customer_id
ORDER BY max_gap_days DESC
    , name ASC
