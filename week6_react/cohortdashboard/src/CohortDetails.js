
import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
  const style = { color: cohort.status === "ongoing" ? "green" : "blue" };

  return (
    <div className={styles.box}>
      <h3 style={style}>{cohort.name}</h3>
      <dl>
        <dt>Status</dt>
        <dd>{cohort.status}</dd>
        <dt>Participants</dt>
        <dd>{cohort.participants}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
